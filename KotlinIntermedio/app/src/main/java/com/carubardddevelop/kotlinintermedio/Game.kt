package com.carubardddevelop.kotlinintermedio

/**
 * Created by CaruBardd on 01/08/2022
 * CaruBardd
 */
interface Game {

    // Una interfaz no puede poseer un constrcutor -> interface Game() {} X
    // Las clases abstractas si pueden poseer un constructor
    // Todos los items de la interfaz deben ser definidos OBLIGATORIAMENTE dentro de la clase que le implemente

    val game: String

    fun play()      // La única forma de usar una interfaz es por medio de una clase, por ende, no es necesario definir ni sus funciones ni sus atributos
    fun stream() {
        println("Estoy haciendo stream de mi juego $game")
    }

}