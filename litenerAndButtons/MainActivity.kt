package ar.com.ifts18.miprimeraapp

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Obtenemos las referencias a los elementos del layout
        val textViewTitulo = findViewById<TextView>(R.id.tvTitulo)
        val boton1 = findViewById<Button>(R.id.boton1)
        val boton2 = findViewById<Button>(R.id.boton2)


        //Configuramos los listeners
        boton1.setOnClickListener {

            textViewTitulo.text = "Se presionó el botón 1"
            textViewTitulo.setTextColor(Color.RED)
            Log.d("botonloco", "Botón 1 presionado")

            Toast.makeText(this, "El botón 1 se ha presionado", Toast.LENGTH_SHORT).show()

        }

        boton2.setOnClickListener {

            textViewTitulo.text = "Se presionó el botón 2"
            textViewTitulo.setTextColor(Color.BLUE)
            Toast.makeText(this, "El botón 2 se ha presionado", Toast.LENGTH_LONG).show()
            Log.d("botonloco", "Botón 2 presionado")
        }

    }
