package com.example.animaosplashlinkedin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.animaosplashlinkedin.databinding.ActivityHome2Binding
import com.example.animaosplashlinkedin.databinding.ActivityHomeBinding


class Home2 : AppCompatActivity() {



    private lateinit var binding: ActivityHome2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHome2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            val home = Intent(this,Home::class.java)
            startActivity(home)
        }
    }
}