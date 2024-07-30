package com.example.drivers_license_tickets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.drivers_license_tickets.databinding.FragmentMainChoiceBinding
import com.example.drivers_license_tickets.databinding.FragmentTestingBinding

class TestingFragment : Fragment() {

    private var _binding: FragmentTestingBinding? = null
    private val binding: FragmentTestingBinding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTestingBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.iconCardView.setOnClickListener {
            findNavController().navigate(R.id.action_testingFragment_to_testResultsFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
