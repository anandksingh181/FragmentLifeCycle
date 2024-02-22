package com.example.fragmentlifecycle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            val fragment = BlankFragment()

            val transient = supportFragmentManager.beginTransaction()
            transient.replace(R.id.frameLayout,fragment)
            transient.addToBackStack(null)
            transient.commit()
        }
    }
}