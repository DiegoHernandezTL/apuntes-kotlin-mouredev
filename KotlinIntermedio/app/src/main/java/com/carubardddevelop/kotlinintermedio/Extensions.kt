package com.carubardddevelop.kotlinintermedio

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by CaruBardd on 02/08/2022
 * CaruBardd
 */

// Extensión de funciones
fun Date?.customFormat() : String? {      // Ahora Date tendrá una nueva función definida en customFormat()
    val formatter = SimpleDateFormat("yyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    this?.let {
        return formatter.format(this)
    } ?: run {
        return null
    }
}

// Extensión de propiedades
val Date?.formatSize : Int
    get() = this.customFormat()?.length ?: 0

// Se puede cambiar la visibilidad de cada extensión definida dentro del documento, funciona del mismo modo que
// funciona dentro de una clase.