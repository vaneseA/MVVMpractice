package com.example.mvvmpractice.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmpractice.R
import com.example.mvvmpractice.databinding.ActivityMainBinding
import com.example.mvvmpractice.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mbiniding: ActivityMainBinding
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbiniding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mbiniding.lifecycleOwner = this
        mbiniding.viewModel = model

        var SetMaxnum = findViewById<Button>(R.id.setMaxNumbtn)

        SetMaxnum.setOnClickListener {
            var intent = Intent(this, SetMaxActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}