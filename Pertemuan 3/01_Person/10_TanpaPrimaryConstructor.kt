package belajar.oop.f01_person.p10 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Person {

    // Constructor pertama: 2 parameter. Nilai parameter langsung diisikan ke properties
    constructor(firstNameParam: String, lastNameParam: String) {
        firstName = firstNameParam
        lastName = lastNameParam
    }

    // Constructor kedua: 3 parameter (lengkap dengan nama tengah)
    constructor(firstNameParam: String, middleNameParam: String, lastNameParam: String) {
        firstName = firstNameParam
        middleName = middleNameParam
        lastName = lastNameParam
    }

    // Deklarasi properties. firstName dan lastName tidak diberi nilai awal karena
    // pasti diisi di dalam constructor. middleName boleh null jika tidak dikirim
    var firstName: String
    var middleName: String? = null
    var lastName: String
}

fun main() {
    // Memakai constructor ke-2 (3 parameter)
    val angga = Person("Angga", "Dwi", "Saputro")

    // Memakai constructor ke-1 (2 parameter)
    val joko = Person("Joko", "Nugroho")

    // Output: Angga
    println(angga.firstName)

    // Output: Nugroho
    println(joko.lastName)
}
