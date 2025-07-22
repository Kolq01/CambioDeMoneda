package com.example.cambiodemoneda.ui.fragments.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.cambiodemoneda.databinding.FragmentNotificationBinding

class NotificationFragment : DialogFragment() {

    companion object {
        const val MY_CHANNEL_ID = "myChannel" // Las constantes van siempr en mayuscula
    }


    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //ACA SIEMPPRE VA LOGICA

    }


}