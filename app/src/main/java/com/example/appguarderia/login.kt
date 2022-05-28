package com.example.appguarderia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appguarderia.ui.home.HomeFragment

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    //vincular
    fun menu(view: View) {
        val intent = Intent(this@login, menu::class.java)
        startActivity(intent)
    }
    //vincular
    fun registro(view: View) {
        val intent = Intent(this@login, registro::class.java)
        startActivity(intent)
    }


}