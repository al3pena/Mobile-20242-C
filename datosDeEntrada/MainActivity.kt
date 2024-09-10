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
        val tvDato = findViewById<TextView>(R.id.tvDato)



        //Configuramos los listeners
        boton1.setOnClickListener {

            val inputDato = tvDato.text.toString()

            if (inputDato.isNotEmpty()){

                textViewTitulo.text = "El dato es: $inputDato"
                textViewTitulo.setTextColor(Color.RED)
            } else {

                Toast.makeText(this, "Ingrese un dato válido", Toast.LENGTH_SHORT).show()
                Log.w("botonloco", "No se ingreso dato valido")
            }







        }
