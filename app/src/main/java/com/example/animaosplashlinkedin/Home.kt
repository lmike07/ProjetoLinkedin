package com.example.animaosplashlinkedin

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.animaosplashlinkedin.databinding.ActivityHomeBinding
import com.example.animaosplashlinkedin.databinding.ActivityMainBinding


class Home : AppCompatActivity() {



    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.criaUmaConta.setOnClickListener {
            val home2 = Intent(this,Home2::class.java)
            startActivity(home2)

        }
    }
}