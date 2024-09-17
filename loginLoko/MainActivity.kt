package ar.com.ifts18.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //SIEMPRE SE QUEDA!!! Es el que llama a mi main .xml, sin esto no vivimos!
        setContentView(R.layout.activity_main)


        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btLogin = findViewById<Button>(R.id.btLogin)

        val datosAlmacenados = getSharedPreferences("loginPref", Context.MODE_PRIVATE)

        val yaSeLogueo = datosAlmacenados.getBoolean("estaLogueado", false)

        if(yaSeLogueo) {

            irAlHome()

            Toast.makeText(this, "OK! ", Toast.LENGTH_LONG).show()

        }


        btLogin.setOnClickListener {

            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            //Valido que las credenciales esten con algo!

            if(username == "QSECOFR" && password == "QSECOFR") {

                datosAlmacenados.edit().apply {

                    putBoolean("estaLogueado", true)
                    putString("username", username)
                    apply()

                }



            } else {

                Toast.makeText(this, "Fallo al ingresar a IBM iSeries Mobile", Toast.LENGTH_LONG).show()
            }

        }

    }


    private fun irAlHome() {


        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()

    }
}
