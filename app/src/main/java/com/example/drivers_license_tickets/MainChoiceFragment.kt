package com.example.drivers_license_tickets

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.drivers_license_tickets.databinding.FragmentMainChoiceBinding

class MainChoiceFragment : Fragment() {
    private var _binding: FragmentMainChoiceBinding? = null
    private val binding: FragmentMainChoiceBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainChoiceBinding.inflate(inflater)
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.categoryA.setIcon(resources.getDrawable(R.drawable.icon_frames, null))
        binding.categoryA.setTitle(resources.getString(R.string.category_a))

        binding.categoryB.setIcon(resources.getDrawable(R.drawable.icon_frames_car, null))
        binding.categoryB.setTitle(resources.getString(R.string.category_b))

        binding.categoryA.setOnClickListener {
            findNavController().navigate(R.id.action_mainChoiceFragment_to_testingFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
