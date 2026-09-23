package belajar.oop.f05_any.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Kotlin otomatis menganggap: class Laptop : Any()
// Jadi Laptop dan Computer punya function bawaan Any seperti toString(), equals(), dan hashCode()
class Laptop(val brand: String) // => class Laptop : Any()
class Computer(val brand: String) // => class Computer : Any()

fun main() {
    val laptop = Laptop("Apple")

    // toString() bawaan Any menghasilkan nama class + '@' + kode hash
    // Output: belajar.oop.f05_any.p01.Laptop@<kode hash>  (kode hash bisa berbeda tiap dijalankan)
    println(laptop.toString())
}
