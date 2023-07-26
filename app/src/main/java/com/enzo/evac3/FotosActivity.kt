package com.enzo.evac3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.enzo.evac3.databinding.ActivityFotosBinding

class FotosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFotosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFotosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_imagen )as NavHostFragment
        val navController = navHostFragment.navController
        binding.bnvMenu.setupWithNavController(navController)
    }
}