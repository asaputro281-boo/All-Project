package belajar.oop.f06_generalfunction.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Laptop(val brand: String)
class Computer(val brand: String)

fun printObject(any: Any) {
    if (any is Laptop) {
        // Setelah lolos 'is Laptop', 'any' otomatis dianggap Laptop sehingga bisa mengakses .brand (smart cast)
        println("Laptop ${any.brand}")
    } else if (any is Computer) {
        println("Computer ${any.brand}")
    } else {
        println(any)
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
