package com.example.creaturemon.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.creaturemon.R

class CreaturemonApplication : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
