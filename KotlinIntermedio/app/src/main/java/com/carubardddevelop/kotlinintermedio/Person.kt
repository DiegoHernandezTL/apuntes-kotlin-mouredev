package com.carubardddevelop.kotlinintermedio

/**
 * Created by CaruBardd on 01/08/2022
 * CaruBardd
 */

// Clase persona Extiende de Clase Abstracta Work (Debe instanciarse) e implementa Game (No se instancia)
open class Person(name: String, age: Int) : Work(), Game { // Al definir la clase como open class, permite extenderla en otras clases

    // Cualquier clase tiene una superclase en común llamada Any
    override fun toString(): String {       // Clase heredada de la clase Any
        return super.toString()
    }

    open fun work() {       // Las clases que van a ser sobreescritas en una clase que le extienda, deben definirse como open
        println("Esta persona está trabajando")
    }

    // Implementación de comportamiento de clase abstracta
    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

    // Game Interface
    override val game: String
        get() = "Euro Truck Simulator 2"
    // overrida val game: String = "Euro Truck Simulator 2"

    override fun play() {
        println("Esta persona esta jugando $game")
    }

}