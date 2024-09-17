package ar.com.ifts18.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        val btnLogout = findViewById<Button>(R.id.btnLogout)

        val datosAlmacenados = getSharedPreferences("loginPref", Context.MODE_PRIVATE)

        //CIERRO SESION, NO SEAN....

        btnLogout.setOnClickListener {

            datosAlmacenados.edit().apply {

                putBoolean("estaLogueado", false)
                apply()

            }

            //Navegar entre "pantallas" activitys o actividades.
            //this nos proporciona en el contexto actual
            //MainActivity::class.java es el formato requerido por el intent
            //MVVM: Model View ViewModel
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()


        }
    }


}
