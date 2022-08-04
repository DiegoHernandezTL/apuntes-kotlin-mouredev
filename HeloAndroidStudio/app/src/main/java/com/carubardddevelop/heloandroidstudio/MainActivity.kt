package com.carubardddevelop.heloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lección 1
//        variablesYConstantes()

        // Lección 2
//        tiposDeDatos()

        // Lección 3
//        sentenciaIf()

        // Lección 4
//        sentenciaWhen()

        // Lección 5
//        arrays()

        // Lección 6
//        maps()

        // Lección 7
//        loops()

        // Lección 8
//        nullSafety()

        // Lección 9
//        funciones()

        // Lección 10
        clases()
    }

    private fun variablesYConstantes() {

        // Variables

        var myFirstVariable: String = "Hello Hackermen!"
        var myFirstNumber: Int = 1
        println(myFirstVariable)
        myFirstVariable = "Bienvenidios a MoureDev"
        // No podemos asignar una viarable Int a una variable de tipo String
        // myFirstNumber = 1
        println(myFirstVariable)
        var mySecondVariable: String = "Suscríbete"
        println(mySecondVariable)
        mySecondVariable = myFirstVariable
        println(mySecondVariable)
        myFirstVariable = "¿Ya te has suscrito?"
        println(myFirstVariable)

        // Constantes

        val myFirstConstant: String = "¿Te ha gustado el tutorial?"
        println(myFirstConstant)
        val mySecondConstant:String = myFirstVariable
        println(mySecondConstant)
    }

    /*
    Aquí vamos a hablar de tipos de datos (data types)
     */
    private fun tiposDeDatos() {

        // String -> Representa una cadena de texto
        val myString: String = "Hola Hackermen!"
        val myString2: String = "Bienvenidos a MoureDev"
        val myString3: String = myString + " " + myString2
        println(myString3)

        // Enteros (Byte [-127 -- 128], Short [-32768 -- 32767], Int [...], Long [...]), se diferencian por la longitud de número
        val myInt: Int = 1
        val myInt2: Int = 2
        val myInt3: Int = myInt + myInt2
        println(myInt3)

        // Decimales (Float [Decimal de hasta 32 bits], Double [Decimal de hasta 64 bits])
        // Para definir un valor de tipo flotante, se debe añadir una f al final del valor
        val myFloat: Float = 1.5f
        val myDouble: Double = 1.5
        val myDouble2: Double = 2.6
        val myDouble3: Double = 1.0
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool) - Solamente puede describir dos valores = true o false
        val myBool: Boolean = true
        val myBool2: Boolean = false
        // Bool es un tipo de dato lógico, no se puede concatenar ni sumar entre si.
//        val myBool3: Boolean = myBool + myBool2
//        println(myBool3)
        println(myBool == myBool2)
        println(myBool != myBool2)
        println(myBool && myBool2)
        println(myBool || myBool2)
    }

    /*
    Aquí vamos a hablar de la sentencia if
     */
    private fun sentenciaIf() {

        val myNumber = 60

        // Operadores Condicionales:
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igualdad
        // != desigualdad

        // Operadores Lógicos :
        // && operador "y"
        // || operador "o"
        // !  operador "no"

        if ((myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            // Sentencia if
            println("${myNumber} es menor, o igual, que 10 y mayor que 5, o es igual a 53")
        } else if (myNumber == 60) {
            println("${myNumber} es igual a 60")
        } else if (myNumber != 70) {
            println("${myNumber} no es igual a 70")
        } else {
            // Sentencia else
            println("${myNumber} es mayor que 10 o menor que 6")
        }

    }

    /*
    Aquí vamos a hablar de la sentencia when
     */
    private fun sentenciaWhen() {

        // When con String
        val country = "EEUU"
        when (country) {
            "España", "Mexico", "Perú", "Colombia", "Argentina" -> {
                println("El idioma es español")
            } "EEUU" -> {
                println("El idioma es inglés")
            } "Francia" -> {
            println("El idioma es francés")
            } else -> {
                println("No conocemos el idioma.")
            }
        }

        // When con Int
        val age = 100
        when (age) {
            in 0 .. 2 -> {
                println("Eres un bebé")
            } in 3 .. 10 -> {
                println("Eres un niño")
            } in 11 .. 17 -> {
                println("Eres un adolescente")
            } in 18 .. 69 -> {
                println("Eres un adulto")
            } in 70 .. 99 -> {
                println("Eres un anciano")
            } else -> {
                println("😱")
            }
        }
    }

    /*
    Aquí vamos a hablar de Arrays o arreglos
     */
    private fun arrays() {
        val name = "Diego"
        val surname = "CaruBardd"
        val company = "CaruBarddDev"
        val age = "22"

        // Creación de un Array
        val myArray = arrayListOf<String>()

        // Anadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        println(myArray)

        // Añadir un conjunto de datos
        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))
        println(myArray)

        // Acceso a datos
        val myCompany: String = myArray[2]
        println(myCompany)

        // Modificación de datos
        myArray[5] = "Suscríbete"
        println(myArray)

        // Eliminación de datos
        myArray.removeAt(4)
        println(myArray)

        // Recorrer Arrays
        myArray.forEach {
            println(it)
        }

        // Operaciones adicionales
        println(myArray.count())  // Muestra lenght
//        myArray.clear()           // Limpia todo el Array
//        println(myArray.count())
        println(myArray.first())    // Llama al primer elemento
        println(myArray.last())     // Llama al útlimo elemento
        myArray.sort()              // Ordenar el array
    }

    /*
    Aquí vamos a hablar de mapas / diccionarios
     */
    private fun maps() {
        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        // Añadir elementos
        // myMap = mapOf("CaruBardd" to 1, "Pedro" to 2, "Sara" to 5) // Tipo de mapa inmutable
        myMap = mutableMapOf("CaruBardd" to 1, "Pedro" to 2, "Sara" to 5) // Tipo de mapa mutable
        println(myMap)

        // Añadir datos uno a uno\
        myMap["Ana"] = 7
        myMap.put("María", 9)
        println(myMap)

        // Actualizar valor de una clave
        myMap.put("CaruBardd", 3)
        myMap["Pedro"] = 1
        println(myMap)

        // Los valores, distinto a las claves, puedes aparecer más de una vez
        myMap.put("Sara", 3)
        println(myMap)

        // Acceso a datos
        println(myMap["Sara"])

        // Eliminación de datos
        myMap.remove("Pedro")
        println(myMap)

    }

    /*
    Aquí vamos a hablar de loops / bucles
     */
    private fun loops() {

        // Bucles
        val myArray: List<String> = listOf("Hola", "Bienvenidos al tutorial", "Suscríbete")
        val myMap: MutableMap<String, Int> = mutableMapOf("Carubardd" to 1, "Sara" to 1, "Pedro" to 2)

        // For
        for(myString in myArray) {
            println(myString)
        }
        for(myElement in myMap) {
            println("${myElement.key}-${myElement.value}")
        }
        for(x in 0..10) {
            println(x)
        }
        for(x in 0 until 10) {      // until no tiene en cuenta el último número
            println(x)
        }
        for(x in 0..20 step 2) {    // step define el incremento
            println(x)
        }
        for(x in 10 downTo 0 step 3) {     // downTo hace una cuenta inversa
            println(x)
        }
        // Definir un Array de un rango numérico
        val myNumericArray = (0..20)
        for(myNum in myNumericArray) {
            println(myNum)
        }

        // While
        var x = 0
        while (x < 10) {
            println(x)
            x++
        }
    }

    /*
    Aquí vamos a hablar de seguridad contra nulos llamada null safety
     */
    private fun nullSafety() {
        var myString = "CaruBardd"
//        var myString = null // Esto generaría un error de compilación
        println(myString)

        // Definición de una variable null safety
        var mySafetyString: String? = "CaruBardd null safety"
        mySafetyString = null
        println(mySafetyString)
        mySafetyString = "Suscríbete!"
//        println(mySafetyString)

        /*
        println(mySafetyString!!)  // Genera Null Pointer Exception
        if(mySafetyString != null){
            println(mySafetyString) // !! después de la variable corrobora que el valor de la variable no sea null
        } else {
            println(mySafetyString)
        }
         */

        // Safe Call
        println(mySafetyString?.length)     // Si la var es null, no la intentará ejecutar "?."
        mySafetyString?.let {
            println(mySafetyString)     // ?.let ejecutará un bloque de codigo cuando la variable sea non-null
        } ?: run {
            println(mySafetyString)     // ?: run ejecutará un bloque de código cuando la variable sea null
        }
    }

    /*
    Aqui vamos a hablar de funciones
     */
    private fun funciones() {
        greeting()
        greeting()
        greeting()
        sayMyName("Caru")
        sayMyName("Diego")
        sayMyName("Sara")
        sayMyNameAndAge("Diego", 22)
        val sumReturn = sumTwoNumbers(32, 56)
        println(sumReturn)
        println(sumTwoNumbers(15, 9))
        println(sumTwoNumbers(10, sumTwoNumbers(5, 5)))
    }
    // Función simple
    private fun greeting() {
        println("Hola")
    }
    // Funciones con parámetros de entrada
    private fun sayMyName(name: String) {
        println("Hola, mi nombre es ${name}")
    }
    // Funciones con más de un parámetro de entrada
    private fun sayMyNameAndAge(name: String, age: Int) {
        println("Hola, mi nombre es ${name} y mi edad es ${age}")
    }
    // Funciones con un valor de retorno
    private fun sumTwoNumbers(fstNum: Int, sndNum: Int): Int {
        val sum = fstNum + sndNum
        return sum
    }

    /*
    Aquí vamos a hablar de las clases
     */
    private fun clases() {
        val carubardd = Programmer("Diego", 22, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.JAVA))
        println(carubardd.name)
        carubardd.age = 40
        carubardd.setDni(1073254847)
        println(carubardd.getDni())
        val sara = Programmer("Sara", 26, arrayOf(Programmer.Language.HTML, Programmer.Language.JAVASCRIPT), arrayOf(carubardd))
        carubardd.code()
        sara.code()

        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")
    }
}