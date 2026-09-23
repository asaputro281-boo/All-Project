package belajar.oop.f01_person.p07 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Person(firstNameParam: String,
             middleNameParam: String?,
             lastNameParam: String) {

    // Initializer Block: kode di dalam 'init' otomatis dijalankan sekali saat objek dibuat
    // Biasanya dipakai untuk validasi data atau proses persiapan awal
    init {
        println("Initializer Block")
    }

    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam
}

fun main() {
    // Saat baris ini dijalankan, init block langsung berjalan (mencetak "Initializer Block")
    val angga = Person("Angga", "Dwi", "Saputro")

    // Output baris pertama : Initializer Block   (berasal dari init block)
    // Output baris kedua   : Angga
    println(angga.firstName)
}
