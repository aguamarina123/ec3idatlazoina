package com.enzo.evac3.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enzo.evac3.R
import com.enzo.evac3.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {

    private lateinit var binding: FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }
}