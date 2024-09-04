package ar.com.ifts18.miprimeraapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val nombre: String = "Android"
        val nombre2 = "Androide"
        var edad: Int = 30

        Log.d("mainActivity", nombre2 + nombre)
        Log.d("mainActivity", edad.toString())

        if(edad > 18) {

            println("La edad es de: $edad")

        }else{

            println("Es menor!!!!")
        }


        for (i in 1..10){

            println(i)

        }

        fun suma(numeroA: Int, numeroB: Int): Int {

            return numeroA + numeroB

        }

        Log.d("mainActivity", suma(23,4).toString())

        //val lo vamos a usar para las variables que no pueden modificarse una vez asignadas
        //son constantes

        val pi: Double = 3.141516
        val iva: Double = 0.21
        val mayoriaEdad: Int = 18
        val secret: String = "V5b9Bk0pWetuW1N6uqnxAA=="

        val mensaje = "Hola, el secret es $secret y el valor de PI es de $pi"
        println(mensaje)


        //Variables MUTABLES, es decir, pueden cambiar su valor una vez inicializadas

        var temperatura: Int = 0

        println("La temperatura es de: $temperatura")

        temperatura = 25

        println("La temperatura ahora es de: $temperatura")


        //Inferencia de tipos

        var secret2 = "V5b9Bk0pWetuW1N6uqnxAA=="
        val secret3 = "V5b9Bk0pWetuW1N6uqnxAA=="

        //VARIABLES NULAS

        //null

        var apellido: String? = null

        println(apellido?.length)

        //Variables de inicialización diferida
        //lateinit

        lateinit var nombreUsuario: String

        fun inicilizarSistema() {

            nombreUsuario = "Pepe"
            println(nombreUsuario)
        }

        inicilizarSistema()



        //Numero entero de 8 bits de -128 a 127
        //Short, -32000 -- 32k, Byte, Short, Int, Long

        val tipoByte: Byte = -12
        val tipoShort: Short = -12441
        val tipoLong: Long = 48231815181818181L

        //Punto Flotante

        val tipoFloat: Float = 15.2F


        val arrayDeEnteros: Array<Int> = arrayOf(1,2,4,5,6,4,3,3,)

        //Supervariable Any

        val cualquierValorMeVieneBien: Any = "Soy un string"

        //INVERSA DE Any,

            fun imprimirMensajeError(errorQueDaLaApp: String): Nothing {

           throw IllegalStateException(errorQueDaLaApp)
        }

        imprimirMensajeError("ERRORRR!!!! 56")


        fun imprimirMensaje(): Unit {

            println("Es un mensaje")
        }

        //Función Implicita!
        fun multiplicar(a: Int, b: Int): Int = a*b

        val pxqDato:Int = multiplicar(2,9)
        println(pxqDato)

        fun tieneUnValPorDefecto(nombreUsuario: String = "Wildcard") {

            println("Bienvenido $nombreUsuario")
        }

        tieneUnValPorDefecto() //Imprime Wilcard
        tieneUnValPorDefecto("Ale")

        //Parametros nombrados

        fun parametrosNombrados(nombre: String, edad:Int = 20, conglomerado: String = "SC") {

            println("$nombre, $edad, $conglomerado")

        }

        parametrosNombrados(conglomerado = "San Pablo", nombre = "Pepe") // Pepe  20 San Pablo




        //FUNCIONES LAMBDA: Función anónima me permite pasar funciones como parámetros de otra funcion

       /// val funcionLambda2 = {parametroN1: String, parametroN2: Int -> bodyaLambda}

        // Todo esto es parámetro: parametroN1: String, parametroN2: Int
        //El cuerpo de la fx es bodyaLambda
        //Tipó de retorno se infiere

        val sumarNumeros = {a: Int, b:Int -> a + b}


        println(sumarNumeros(5,3)) //7



        fun operacionesComplejas(a:Int, b:Int, operando: (Int, Int) -> Int ): Int {

            return operando(a,b)
        }

        //Función operaciónCompleja

        //1) Dos enteros: a y b
        //2) una funcón anónima o lambda que me define como operar con esas enteros


        //Suma

        val resultadoSuma = operacionesComplejas(5,7) {xx, zz -> xx + zz} // 12


        //resta

        val resultadoResta = operacionesComplejas(15,5) {xx, zz -> xx - zz} // 10

        //multiplicacion

        val resultadoMultiplicacion = operacionesComplejas(5,7) {xx, zz -> xx * zz} //35

        //Suma

       // val resultadoPotencia = operacionesComplejas(5,2) {xx, zz -> xx ** zz}

    }

