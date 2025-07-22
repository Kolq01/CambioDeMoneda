package com.example.cambiodemoneda.data.model

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cambiodemoneda.databinding.MoneyItemBinding


class DolarViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = MoneyItemBinding.bind(view)
    fun bind(money:Any){
        when(money){
            is Blue -> {
                binding.tvMonedaNombre.text = "Dólar Blue"
                binding.tvValorVenta.text = money.venta + " $"
                binding.tvValorCompra.text = money.compra + " $"
            }
            is Oficial -> {
                binding.tvMonedaNombre.text = "Dólar Oficial"
                binding.tvValorVenta.text = money.venta + " $"
                binding.tvValorCompra.text = money.compra + " $"
            }
            is MEP -> {
                binding.tvMonedaNombre.text = "Dólar MEP"
                binding.tvValorVenta.text = money.venta + " $"
                binding.tvValorCompra.text = money.compra + " $"
            }
            is CCL -> {
                binding.tvMonedaNombre.text = "Dólar CCL"
                binding.tvValorVenta.text = money.venta + " $"
                binding.tvValorCompra.text = money.compra + " $"
            }
            is Mayorista -> {
                binding.tvMonedaNombre.text = "Dólar Mayorista"
                binding.tvValorVenta.text = money.venta + " $"
                binding.tvValorCompra.text = money.compra + " $"
            }
            is Cripto -> {
                binding.tvMonedaNombre.text = "Dólar Cripto"
                binding.tvValorVenta.text = money.venta + " $"
                binding.tvValorCompra.text = money.compra + " $"
            }
            is Tarjeta -> {
                binding.tvMonedaNombre.text = "Dólar Tarjeta"
                binding.tvValorVenta.text = money.venta + " $"
                binding.tvValorCompra.text = money.compra + " $"
            }
        }
        binding.tvValorVenta
    }
}