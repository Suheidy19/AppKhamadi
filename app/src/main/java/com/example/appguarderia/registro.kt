package com.example.appguarderia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
    }
    //vincular
    fun login(view: View) {
        val intent = Intent(this@registro, login::class.java)
        startActivity(intent)

    }
}