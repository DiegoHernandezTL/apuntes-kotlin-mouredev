package com.carubardddevelop.heloandroidstudio

/**
 * Created By CaruBardd on 2020-08-01.
 * CaruBardd
 */
class Programmer(
    val name: String,
    var age: Int,
    val languages: Array<Language>,
    val friends: Array<Programmer>? = null //Friends puede ser nulo o puede tener un valor
    ) {

    enum class Language {
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT,
        HTML
    }

    private var dni: Int? = null

    public fun setDni(docNumber: Int) {
        if(docNumber > 0) {
            dni = docNumber
        }
    }

    public fun getDni(): Int? {
        dni?.let {
            return dni
        } ?: run {
            return 0
        }
    }

    public fun code() {
        for (lang in languages) {
            println("Estoy programando en ${lang}")
        }
    }

}