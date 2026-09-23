package belajar.oop.f12_lateinitializedproperties.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Television {
    lateinit var brand: String

    fun initTelevision() {
        brand = "Samsung"
    }
}

fun main() {
    val television = Television()

    // println(television.brand) // error (UninitializedPropertyAccessException) - hapus // untuk mencoba
    // Error terjadi karena brand belum diisi tetapi sudah dibaca

    // Mengisi brand lewat function initTelevision()
    television.initTelevision()

    // Sekarang brand sudah terisi sehingga aman dibaca
    // Output: Samsung
    println(television.brand) // success
}
