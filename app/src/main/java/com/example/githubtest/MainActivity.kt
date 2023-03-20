package com.example.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var a = 2
    val dsds = 3125
    var b = 4
    var resultat = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val e = 3215
        setContentView(R.layout.activity_main)
        resultat = a + b
    }
}