package com.carubardddevelop.kotlinintermedio

/**
 * Created by CaruBardd on 02/08/2022
 * CaruBardd
 */

// Rcomendación : Trabajar con propiedades INMUTABLES siempre que sea posible
data class Worker(val name: String = "", val age: Int = 0, val work: String = "") {        // Para la creación de una data class se pone igual : data class

    var lastWork: String = ""

}