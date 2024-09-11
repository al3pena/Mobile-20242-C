package ar.com.ifts18.miprimeraapp

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Obtenemos las referencias a los elementos del layout
        val textViewTitulo = findViewById<TextView>(R.id.resultado)
        val boton1 = findViewById<Button>(R.id.enviar)
        val etNombre = findViewById<EditText>(R.id.nombre)
        val etEdad = findViewById<EditText>(R.id.edad)
        val spinner = findViewById<Spinner>(R.id.spinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.entradas,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
        
        

        //Configuramos los listeners
        boton1.setOnClickListener {

            val entradaSeleccionada = spinner.selectedItem.toString()

            val nombre = etNombre.text.toString()
            val edad = etEdad.text.toString()

            if (nombre.isEmpty()){

                Toast.makeText(this, "Ingrese un nombre ", Toast.LENGTH_SHORT).show()
            } else if (edad.isEmpty()) {

                Toast.makeText(this, "Ingrese una edad", Toast.LENGTH_SHORT).show()

            } else {

                //Covertimos la edad a numero

                val edadNumero = edad.toIntOrNull()

                if(edadNumero == null || edadNumero <= 0 ) {

                    Toast.makeText(this, "Ingrese una edad valida que no sea 0", Toast.LENGTH_SHORT).show()

                } else {

                    textViewTitulo.text = "Hola, $nombre, tenés $edad y sos $entradaSeleccionada"
                }

            }

        }



    }
}
