package com.example.cambiodemoneda.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cambiodemoneda.R
import com.example.cambiodemoneda.data.model.services.APIService
import com.example.cambiodemoneda.data.model.DolarAdapter
import com.example.cambiodemoneda.databinding.FragmentHomeBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: DolarAdapter
    private val dolar1 = mutableListOf<Any>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        loadAllDolarData()
        configSwipe()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun configSwipe() {
        binding.swipe.setColorSchemeResources(R.color.md_theme_outline)
        binding.swipe.setOnRefreshListener {
            Log.i("funca","funciona")
            loadAllDolarData()
            binding.swipe.isRefreshing = false
        }
    }

    private fun initRecyclerView(){
        adapter = DolarAdapter(dolar1)
        binding.recyclerMoney.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerMoney.adapter = adapter
    }

    private fun loadAllDolarData() {
        CoroutineScope(Dispatchers.Main).launch {
            try {
                dolar1.clear() // Limpia la lista antes de agregar nuevos datos

                val blueResponse = getRetrofit().create(APIService::class.java).getDolarBlue()
                blueResponse.body()?.let { dolar1.add(it) }

                val oficialResponse = getRetrofit().create(APIService::class.java).getDolarOficial()
                oficialResponse.body()?.let { dolar1.add(it) }

                val mepResponse = getRetrofit().create(APIService::class.java).getDolarMep()
                mepResponse.body()?.let { dolar1.add(it) }

                val cclResponse = getRetrofit().create(APIService::class.java).getDolarCCL()
                cclResponse.body()?.let { dolar1.add(it) }

                val mayoristaResponse = getRetrofit().create(APIService::class.java).getDolarMayorista()
                mayoristaResponse.body()?.let { dolar1.add(it) }

                val criptoResponse = getRetrofit().create(APIService::class.java).getDolarCripto()
                criptoResponse.body()?.let { dolar1.add(it) }

                val tarjetaResponse = getRetrofit().create(APIService::class.java).getDolarTarjeta()
                tarjetaResponse.body()?.let { dolar1.add(it) }

                adapter.notifyDataSetChanged() // Notifica al adapter que los datos han cambiado

            } catch (e: Exception) {
                e.printStackTrace()
                showError() // Muestra un mensaje de error si algo falla
            }
        }
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://dolarapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun showError() {
        Toast.makeText(requireContext(), "Ha ocurrido un error", Toast.LENGTH_SHORT).show()
    }

}