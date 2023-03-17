package com.example.animals_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animals_app.databinding.ActivityDefinitionBinding
import com.example.animals_app.databinding.ActivityMainBinding

class Definition:AppCompatActivity() {
    private lateinit var binding: ActivityDefinitionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDefinitionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}