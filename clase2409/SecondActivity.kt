package ar.edu.angulos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        val tvUsuario = findViewById<TextView>(R.id.tvUsuario)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)

        val usuario = intent.getStringExtra("USUARIO")
        val email = intent.getStringExtra("EMAIL")

        tvUsuario.text = usuario
        tvEmail.text = email

        Log.d("activity", "Estoy en el 2 Activity!!")

    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()

        return true
    }
}
