package com.carubardddevelop.kotlinintermedio

/**
 * Created by CaruBardd on 01/08/2022
 * CaruBardd
 */
abstract class Work {       // Para definir una clase abstracta se usa abstract class

    /**
     * Clase abstracta:
     * No define una implementación, solamente define el comportamiento de
     * las clases que le extiendan
     */
    var myWork: String = "Programador"

    abstract fun goToWork()

}