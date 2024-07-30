package com.example.drivers_license_tickets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.drivers_license_tickets.databinding.FragmentMistakesBinding
import com.example.drivers_license_tickets.databinding.FragmentTestingBinding

class MistakesFragment : Fragment() {
    private var _binding: FragmentMistakesBinding? = null
    private val binding: FragmentMistakesBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMistakesBinding.inflate(inflater)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
