package com.example.cambiodemoneda.ui.fragments.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.cambiodemoneda.R
import com.example.cambiodemoneda.databinding.FragmentCalculatorBinding

class Calculator : DialogFragment() {

    private var _binding: FragmentCalculatorBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_calculator, container, false)

    }

}