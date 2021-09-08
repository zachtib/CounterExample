package com.zachtib.counterexample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.zachtib.counterexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.counterValue.observe(this) { value ->
            binding.counterTextView.text = "$value"
        }

        binding.incrementButton.setOnClickListener {
            viewModel.incrementPressed()
        }
    }
}