package com.example.appguarderia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Toast.makeText(this, "Usted no esta disponible", Toast.LENGTH_SHORT).show()

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

    fun entrar(view: View) {
        val Ususario = findViewById<EditText>(R.id.editTextTextPersonName2).text.toString().trim()
        val Contraseña = findViewById<EditText>(R.id.editTextTextPassword).text.toString()

        if (Ususario == "suheidy" && Contraseña == "12345") {
            val home = Intent(this@login, menu::class.java)
            startActivity(home)

            val toast = Toast.makeText(applicationContext, "Ingreso correcto", Toast.LENGTH_SHORT)
            toast.show()
        } else {
            val toast = Toast.makeText(
                applicationContext,
                "Usuario o contraseña incorrectos",
                Toast.LENGTH_SHORT
            )
            toast.show()
            findViewById<EditText>(R.id.editTextTextPersonName2).setText("")
            findViewById<EditText>(R.id.editTextTextPassword).setText("")
        }


    }
}
