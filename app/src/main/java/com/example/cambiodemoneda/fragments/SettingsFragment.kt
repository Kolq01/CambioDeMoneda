package com.example.cambiodemoneda.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.cambiodemoneda.databinding.FragmentSettingsBinding
import com.example.cambiodemoneda.fragments.dialogfragment.Information
import com.example.cambiodemoneda.fragments.dialogfragment.NotificationFragment
import com.example.cambiodemoneda.fragments.dialogfragment.ThemeApp

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.theme.setOnClickListener{
            val showPopUp = ThemeApp()
            showPopUp.show(childFragmentManager, "ThemeAppDialog")
        }

        binding.notifications.setOnClickListener{
            val showPopUp = NotificationFragment()
            showPopUp.show(childFragmentManager, "NotificationDialog")
        }
        /*
        binding.noads.setOnClickListener{
            val showPopUp = ThemeApp()
            showPopUp.show(childFragmentManager, "ThemeAppDialog")
        }
        */

        binding.help.setOnClickListener{
            val showPopUp = Information()
            showPopUp.show(childFragmentManager, "InformationDialog")
        }

    }

}