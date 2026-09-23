package belajar.oop.f01_person.p11 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Menulis 'val' / 'var' di parameter constructor otomatis membuat parameter itu menjadi properti class
// Parameter middleName punya nilai default null, jadi boleh tidak dikirim saat membuat objek
class Person(val firstName: String,
             val middleName: String? = null,
             val lastName: String) {
}

fun main() {
    // Mengirim ketiga data secara berurutan
    val angga = Person("Angga", "Dwi", "Saputro")

    // Memakai named argument (menyebut nama parameter), middleName dilewati sehingga bernilai null
    val joko = Person(firstName = "Joko", lastName = "Nugroho")

    // Output: Angga
    println(angga.firstName)

    // Output: Nugroho
    println(joko.lastName)
}
