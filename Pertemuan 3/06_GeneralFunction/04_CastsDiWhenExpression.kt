package belajar.oop.f06_generalfunction.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Laptop(val brand: String)
class Computer(val brand: String)

fun printObject(any: Any) {
    // 'when' mirip switch-case. Tiap cabang mengecek tipe dengan 'is'
    when (any) {
        is Laptop -> println("Laptop ${any.brand}")       // any otomatis di-cast menjadi Laptop
        is Computer -> println("Computer ${any.brand}")   // any otomatis di-cast menjadi Computer
        else -> println(any)                              // selain itu, cetak apa adanya
    }
}

fun main() {
    // Output: Laptop Apple
    printObject(Laptop("Apple"))

    // Output: Computer Dell
    printObject(Computer("Dell"))

    // Output: Angga Dwi Saputro
    printObject("Angga Dwi Saputro")
}
