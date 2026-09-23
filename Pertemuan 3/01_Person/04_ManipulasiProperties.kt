package belajar.oop.f01_person.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Person {
    // Properti-properti milik Person (bisa diubah karena memakai 'var')
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""
}

fun main() {
    // Membuat object Person dengan nama variabel 'angga'
    val angga = Person()

    // Mengisi nilai properti dengan operator '=' (memanipulasi properties)
    angga.firstName = "Angga"
    angga.middleName = "Dwi"
    angga.lastName = "Saputro"

    // Membaca nilai properti firstName lalu mencetaknya ke layar
    // Output: Angga
    println(angga.firstName)
}
