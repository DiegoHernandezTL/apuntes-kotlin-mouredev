package com.carubardddevelop.kotlinintermedio

/**
 * Created by CaruBardd on 01/8/2022
 * CaruBardd
 */

// La clase Programmer extiende de la clase Person y de la interfaz Vehicle, dado que no puede extender de dos clases a la vez
class Programmer(name: String, age: Int, val language: String): Person(name, age), Vehicle {  // Para extender una clase se debe agregar : Class  (La clase extendida debe ser open class)

    // Sobreescritura de métodos de la clase madre
    override fun work() {
        println("Esta persona está programando")
    }

    override fun goToWork() {
        println("Esta persona va a Google")
    }

    override fun drive() {
        println("Esta persona conduce un coche.")
    }

    fun sayLanguage() {
        println("Este programador usa el lenguaje ${language}")
    }

}