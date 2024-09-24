package ar.edu.angulos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.linear_layout)

        val cbTyC = findViewById<CheckBox>(R.id.cbTyC)
        val btEnviar = findViewById<Button>(R.id.btEnviar)

        val rgOpciones = findViewById<RadioGroup>(R.id.rgOpciones)

        btEnviar.setOnClickListener {


            val rbSeleccionado = rgOpciones.checkedRadioButtonId


            if(rbSeleccionado != -1) {

                //Encontrar el RB correspondiente
                val rbSeleccionado = findViewById<RadioButton>(rbSeleccionado)

                val opcion = rbSeleccionado.text
                Log.d("tag", "Se selecciono $opcion")

            }else{

                //TBD Se debe seleccionar un RB
                Log.d("tag", "No se seleccionó nada")
            }





            if(cbTyC.isChecked) {

                Toast.makeText(this,"Aceptaste", Toast.LENGTH_LONG).show()
                Log.d("tag", "OK")
            }else{

                Toast.makeText(this,"Noppp", Toast.LENGTH_LONG).show()
                Log.d("tag", "NO OK")
            }


        }



        }

    }
