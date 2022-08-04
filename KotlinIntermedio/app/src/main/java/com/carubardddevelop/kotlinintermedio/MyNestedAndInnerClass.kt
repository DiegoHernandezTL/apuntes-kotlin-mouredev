package com.carubardddevelop.kotlinintermedio

/**
 * Created by CaruBardd on 07/08/2022.
 * CaruBardd
 */
class MyNestedAndInnerClass {

    /**
     * Clase anidada:
     * Está contenida dentro de otra clase. Favorece el encapsulamiento y no puede
     * acceder a los miembros de la clas externa
     */

    private val one = 1  // Este valor no podrá ser usado la clase anidada

    // Clase anidada (Nested Class)
    class MyNestedClass {
        fun sum(first: Int, second: Int) : Int {
            return first + second
        }
    }

    /**
     * Clase interna:
     * Esta contenida dentro de otra clase. Favorece el encapsulamiento y sí que puede
     * acceder a los miembros de la clase externa.
     */

    private fun returnOne() : Int {
        return one;
    }

    // Clase interna (Inner Class)
    inner class MyInnerClass {

        fun sumTwo(number: Int) : Int {
            return number + one + returnOne()
        }
    }
}