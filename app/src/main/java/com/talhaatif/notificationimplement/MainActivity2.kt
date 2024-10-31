package com.talhaatif.notificationimplement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.talhaatif.notificationimplement.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var  binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        // bind krdu views ko
        setContentView(binding.root)

            // now intent that is triggered due to intent filter in manifest file
        binding.textView.text = intent.getStringExtra("key")


    }
}