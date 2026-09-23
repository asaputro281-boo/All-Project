package belajar.oop.f01_person.p09 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Person(firstNameParam: String,
             middleNameParam: String?,
             lastNameParam: String) {

    // Secondary constructor: nama tengah otomatis null
    constructor(firstNameParam: String, lastNameParam: String) :
            this(firstNameParam, null, lastNameParam) {
        // do something here
    }

    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam
}

fun main() {
    // Memakai primary constructor (3 data)
    val angga = Person("Angga", "Dwi", "Saputro")

    // Memakai secondary constructor (2 data saja, nama tengah otomatis null)
    val joko = Person("Joko", "Nugroho")

    // Output: Angga
    println(angga.firstName)

    // Output: Nugroho
    println(joko.lastName)
}
