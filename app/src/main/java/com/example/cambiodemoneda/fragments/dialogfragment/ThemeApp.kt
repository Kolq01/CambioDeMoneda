package com.example.cambiodemoneda.fragments.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.DialogFragment
import androidx.preference.PreferenceManager
import com.example.cambiodemoneda.MainActivity
import com.example.cambiodemoneda.R
import com.example.cambiodemoneda.databinding.FragmentThemeAppBinding
import androidx.core.content.edit
import com.google.android.material.checkbox.MaterialCheckBox

class ThemeApp : DialogFragment() {

    private var _binding: FragmentThemeAppBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentThemeAppBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val radioGroupTheme: RadioGroup = requireView().findViewById(R.id.dialog_fragment_theme) // Asume que tienes un RadioGroup en tu layout
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(requireContext())

        when (sharedPreferences.getString("app_theme", "system_default")) {
            "light" -> requireView().findViewById<RadioButton>(R.id.lightMode)?.isChecked = true
            "dark" -> requireView().findViewById<RadioButton>(R.id.darkMode)?.isChecked = true
            "system_default" -> requireView().findViewById<RadioButton>(R.id.systemMode)?.isChecked = true
        }

        radioGroupTheme.setOnCheckedChangeListener { _, checkedId ->
            if (activity is MainActivity) {
                val mainActivity = activity as MainActivity
                sharedPreferences.edit {

                    when (checkedId) {
                        R.id.lightMode -> {
                            mainActivity.disableDarkMode()
                            putString("app_theme", "light")
                        }

                        R.id.darkMode -> {
                            mainActivity.enableDarkMode()
                            putString("app_theme", "dark")
                        }

                        R.id.systemMode -> {
                            mainActivity.systemMode()
                            putString("app_theme", "system_default")
                        }
                    }
                }
                dismiss()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}