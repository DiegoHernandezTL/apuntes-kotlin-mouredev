package com.carubardddevelop.kotlinintermedio

/**
 * Created by CaruBardd on 01/08/2022
 * CaruBardd
 */
open class Visibility {

    // Public / Default
    var name: String? = null

    fun sayMyName() {
        name?.let {
            println("Mi nombre es $it")
        } ?: run {
            println("No tengo nombre")
        }
    }

    fun sayMyLastName() {
        val visibility = VisibilityTwo()
    }
}

// Private
private class VisibilityTwo {

    private var lastname: String? = null
    private fun sayMyLastName() {
        lastname?.let {
            println("Mi apellido es $it")
        } ?: run {
            println("No tengo apellido")
        }
    }
    fun setMyLastName(lastName: String) {
        this.lastname = lastname
    }

}

//
class VisibilityThree: Visibility() {
    fun sayMySurname() {

    }
}