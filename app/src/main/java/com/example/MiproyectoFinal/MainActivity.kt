package com.example.MiproyectoFinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.MiproyectoFinal.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val junior: String = "JUNIOR"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}






