package com.carubardddevelop.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

// Para definir un Type Aliases, se debe definir al inicio del código
// Tipo de Dato
typealias MyMapList = MutableMap<Int, ArrayList<String>>
// Funciones
typealias MyFunc = (Int, String, MyMapList) -> Boolean
// Clases anidadas
typealias TheNestedClass = MyNestedAndInnerClass.MyNestedClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enum Clases
//        enumClasses()

        // Clases anidadas e internas - Nested and Inner Classes
//        nestedAndInnerClasses()

        // Herencia de Clases y Clase Abstracta
//        classInheritanceAndAbstractClass()

        // Interfaces
//        interfaces()

        // Modificadores de visibilidad
//        visibilityModifiers()

        // Data Classes
//        dataClasses()

        // Type Aliases
//        typeAliases()

        // Destructuring Declarations
//        destructuringDeclarations()

        // Extensiones
//        extensions()

        // LAMBDAS
//        lambdas()

    }


    /**
     * LECCION 1
     * KOTLIN INTERMEDIO
     * ENUM CLASS
     */
    enum class Direction(val dir : Int) {   // Al definir parámetros de entrada, se deben asignar a cada enum dentro de la clase
        NORTH(1), SOUTH(-1), EAST(1), WEST(-1);       // Al poner un ; al final, se pueden añadir más instrucciones en las lineas siguientes
        fun description() : String {
            return when (this) {                // Será obligatorio definir todos los valores posibles de la enum class
                NORTH -> "La dirección es NORTE"
                SOUTH -> "La dirección es SUR"
                EAST -> "La dirección es ESTE"
                WEST -> "La dirección es OESTE"
                else -> "La dirección no ha sido definida"
                }
            }
    }

    private fun enumClasses() {

        // Asignación de valores
        var userDirection: Direction? = null
        println("Dirección: ${userDirection}")

        userDirection = Direction.NORTH
        println("Dirección: ${userDirection}")

        // Propiedades por defecto
        println("Propiedad name: ${userDirection.name}")        // Nombre de la enumeración
        println("Propiedad ordinal: ${userDirection.ordinal}")  // Posición dentro de la enumeración
        println("Posibles valores: ${Direction.values()}")      // Muestra todos los posibles valores dentro de la clase enum

        // Funciones
        println(userDirection.description())

        // Inicialización
        println(userDirection.dir)
    }

    /**
     * LECCION 2
     * KOTLIN INTERMEDIO
     * NESTED AND INNER CLASSES
     */
    private fun nestedAndInnerClasses() {

        // Clase anidada (nested)
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum = myNestedClass.sum(10 , 5)
        println("El resultado de la suma es ${sum}")

        // Clase interna (inner)
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass() // Para instanciar inner class se debe instanciar antes a clase externa
        val sumTwo = myInnerClass.sumTwo(10)
        println("El resultado de sumar dos es ${sumTwo}")

    }

    /**
     * LECCION 3
     * KOTLIN INTERMEDIO
     * CLASS INHERITANCE & ABSTRACT CLASS
     */
    private fun classInheritanceAndAbstractClass() {
        val person = Person("Jose", 23)

        val programmer = Programmer("Diego", 22, "Kotlin")
        programmer.work()
        programmer.sayLanguage()
        programmer.goToWork()
        programmer.drive()

        val designer = Designer("Sara", 26)
        designer.work()
        designer.goToWork()
    }

    /**
     * LECCION 4
     * KOTLIN INTERMEDIO
     * INTERFACES
     *
     * Pueden contener declaraciones abstractas o implementaciones de funciones o propieades.
     * La diferencia con las clases abstractas es que las interfaces nunca
     * pueden almacenar un estado.
     */
    private fun interfaces() {
        val gamer = Person("CaruBardd", 22)
        gamer.play()
        gamer.stream()
    }

    /**
     * LECCION 5
     * KOTLIN INTERMEDIO
     * MODIFICADORES DE VISIBILIDAD
     *
     * Las clases, objets, interfaces, constructores, funciones, y propiedades y accesos
     * get/set pueden tener modificadores de visibilidad
     */
    private fun visibilityModifiers() {

        // Si no se define la visibilidad, su valor defecto será -> public

        // Modificador De Acceso Public
        // Defaut. Declaraciones visibles y accesibles desde cualquier parte de nuestro código.
        val visibility = Visibility()
        visibility.name = "Diego"
        visibility.sayMyName()

        // Modificador de Acceso Private
        // Declaraciones visibles y accesibles sólo desde el archivo en el que se encuentra la declaración
        visibility.sayMyLastName()

        // Modificador de Acceso Protected
        // Comportamiento igual que private, exceptuando que el acceso no estará disponible para declaraciones
        // de nivel superior y sí para nivel inferior (subclases) ((Como si fuere público para las subclases
        // pero privado para las clases superiores))

        // Modificador de Acceso Internal
        // Declaraciones visibiles y accesibles desde cualquier parte del módulo (Nuestra App).

    }

    /**
     * LECCIÓN 6
     * KOTLIN INTERMEDIO
     * DATA CLASSES
     *
     * Suelen ser utilizados únicamente para almacenar datos
     * Ofrecen operaciones relacionadas con el manejo de los datos
     */
    private fun dataClasses() {
        val carubardd = Worker("Diego Hernandez", 22, "Desarrollador")
        val mouredev = Worker("Diego Hernandez", 22, "Desarrollador")
        carubardd.lastWork = "Mesero"
        val sara = Worker()

        // equls & hashCode
        // Permite comparar objetos de la misma data class
        if(carubardd.equals(sara)){
            println("Son iguales")
        } else {
            println("No son iguales")
        }
        if(carubardd == mouredev){
            println("Son iguales")
        } else {
            println("No son iguales")
        }

        // toString
        // Devuelve una representación legible de los datos utilizados en el constructor del objeto
        println(carubardd.toString())

        // Copy
        // Realizar la copi a deun objeto dado con la posibilidad de modificar propiedades del objeto raiz
        val carubardd199 = carubardd.copy(age = 21)
        println(carubardd199.toString())

        // Acceso automático a funciones de tipo componentN (Funciones de desestructuración de clases)
        // Sirven para descomponer una clase en elemento más pequeños basados en
        // propiedades que éstas contienen
        val (name, age) = carubardd     // la dupla se define en el mismo orden que el consctructor
        println("La variable name contiene $name y la variable age contiene $age")

    }

    /**
     * LECCIÓN 7
     * KOTLIN INTERMEDIO
     * TYPE ALIASES
     *
     * Alias de tipo, sirven para poner un alias a tipos ya existentes, se suelen utilziar cuando
     * existen tipos con nombres demasiado largos o poco legibles
     *
     * Se deben definir al incio del documento, como una manera global.
     */
    private var myMap: MutableMap<Int, ArrayList<String>> = mutableMapOf() // Sin definir typealias
    private fun typeAliases() {

        var myNewMap: MyMapList = mutableMapOf() // Usando typealias definido al inicio del documento
        myNewMap[1] = arrayListOf("Diego", "Hernandez")
        myNewMap[2] = arrayListOf("CaruBardd", "carubardd")

        myMap = myNewMap

        // También se puede utilizar para representar funciones

        // También pueden hacer referencia a clases anidadas

    }

    /**
     * LECCIÓN 8
     * KOTLIN INTERMEDIO
     * DESTRUCTURING DECLARATIONS
     *
     * Crear varias variables con una única operacion
     * Desestructurar varios componentes en un único elemento
     */
    private fun destructuringDeclarations() {

        // Descomposición de Data Class Worker en varios componentes sin instanciarlo previamente en otro
        val (name, age, work) = Worker("Diego Hernandez", 22, "Desarrollador")
        println("El nombre es $name, la edad es $age, su trabajo es ${work.lowercase()}")

        val carubardd = Worker("CaruBardd", 22, "Programador")
        println(carubardd.component1())         // Con componentN, donde N es el número según su orden en el constructor, se puede obtener el valor del componente

        val (workerName, workerAge) = myWorker()     // También se puede desestructurar el return de una función

        // Desestructuración en Mapas
        val myMap = mapOf(1 to "Caru", 2 to "Sara", 3 to "Ana")
        // A partir de elemento
        for (element in myMap) {
            println("${element.key}, ${element.value} ")                    // Sin desestructuración
            println("${element.component1()}, ${element.component2()}")     // Con desestructuración
        }
        // Desestructurando sin elemento
        for((id, value) in myMap) {
            println("$id, $value")
        }

        // Variables underscore
        // Permite acceder a componentes sin seguir el orden explícito del constructor
        val (caruName, _, caruWork) = Worker("Diego Hernandez", 22, "Desarrollador")
        println("Underscored: Su nombre es $caruName y trabaja como ${caruWork.lowercase()}")


    }
    private fun myWorker() : Worker {
        return Worker("Diego Hernandez", 22, "Programador")

    }

    /**
     * LECCIÓN 9
     * KOTLIN INTERMEDIO
     * EXTENSIONS
     *
     * Permiten ampliar la funcionalidad en clases sin tener que recurrir a la herencia
     * Podrían llegar a crearse funciones de clases que no son directamente "nuestras", es decir,
     * que están en librerías de terceros, sin tener que editar a las mismas.
     * Tambien existen propiedades de extensión para añadirlas a clases ya existentes.
     *
     * Las extensiones se resuelven de manera estática, es decir que no se debe realizar ninguna instancia
     * de las mismas para poder utilizarlas
     */
    private fun extensions() {

        // Extensión de funciones
        val myDate = Date() //Objeto complejo
        println(myDate.customFormat())

        var myDateNullable: Date? = null
        println(myDateNullable.customFormat())

        // Extensión de propiedades
        println(myDate.formatSize)
        println(myDateNullable.formatSize)

    }

    /**
     * LECCIÓN 10
     * KOTLIN INTERMEDIO
     * LAMBDAS
     *
     * Formas más avanzada, potente y concreta de trabajar con funciones
     * Implementación sencilla
     * Funcion de orden superior
     * Funciones que permiten definir variables o funciones que van a trabajar con otras funciones
     *
     * Lamba devolverá el resultado de la última línea, únicamente
     *
     */
    private fun lambdas() {

        // Funciones Callback -> De tipo asíncrona
        myAsyncFun("Diego Hernandez") {
            println(it)
        }

        val myIntList = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val myFilterIntList = myIntList.filter { myInt ->       // Por defecto, el valor de lambda se almacena como it", pero se puede redefinir {newName -> code}
            println(myInt)
            // Realizaar un doble filtrado donde 1 y x > 5 sean números válidos
            // Se establece a return@filter true
            if(myInt == 1) {
                return@filter true
            }
            myInt > 5
        }
        println(myFilterIntList)

        // Crear una función lambda
        val mySunFun = fun (x: Int, y: Int): Int = x + y
        val myMultfun = fun (x: Int, y: Int): Int = x * y
        println(myOperateFun(5, 10, myMultfun))

        myOperateFun(5, 10) { x, y -> x - y }   // Se aprovecha la propia lambda para definir la función internamente
        // En caso de existir más de un valor de entrada, se les debe definir nombre

    }
    private fun myOperateFun(x: Int, y: Int, myFun: (Int, Int) -> Int): Int {
        return myFun(x, y)
    }
    private fun myAsyncFun(name: String, hello: (String) -> Unit) {
        val myNewString = "Hello $name!"
        // Para simular la asincronía, se va adormir al hilo durante 5 segundos
        thread {
            Thread.sleep(5000)
            hello(myNewString)
        }
    }
}