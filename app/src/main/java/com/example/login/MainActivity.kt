package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var enviar: Button
    lateinit var usuario: String
    lateinit var contraseña: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val EditTextUsuario: EditText = findViewById(R.id.usuario)
        val EditTextContraseña: EditText = findViewById(R.id.contraseña)
        enviar = findViewById(R.id.enviar)

        enviar.setOnClickListener {
            usuario = EditTextUsuario.text.toString()
            contraseña = EditTextContraseña.text.toString()

            if (usuario == "aldair" && contraseña == "aldair123") {
                val intent = Intent(this, MainActivity2::class.java)
                val mensaje = "Bienvenido $usuario"
                Toast.makeText(applicationContext, mensaje, Toast.LENGTH_SHORT).show()
                intent.putExtra("usuario",usuario)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Error al iniciar sesión", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
