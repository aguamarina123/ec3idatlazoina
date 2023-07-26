package com.enzo.evac3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enzo.evac3.R
import com.enzo.evac3.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentInfoBinding.inflate(inflater,container,false)
        return binding.root
    }

}