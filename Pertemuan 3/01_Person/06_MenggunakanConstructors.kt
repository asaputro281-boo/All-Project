package belajar.oop.f01_person.p06 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Person(firstNameParam: String,
             middleNameParam: String?,
             lastNameParam: String) {

    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam
}

fun main() {
    // Membuat objek Person sekaligus mengirim 3 data ke constructor (nama depan, tengah, belakang)
    val angga = Person(
        "Angga",
        "Dwi",
        "Saputro"
    )

    // Mencetak nama depan
    // Output: Angga
    println(angga.firstName)
}
