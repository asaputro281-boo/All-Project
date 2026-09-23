package belajar.oop.f06_generalfunction.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Laptop(val brand: String)
class Computer(val brand: String)

// Parameter bertipe Any = boleh menerima objek dari class apa saja
fun printObject(any: Any) {
    println(any)
}

fun main() {
    // Output: belajar.oop.f06_generalfunction.p01.Laptop@<kode hash>
    printObject(Laptop("Apple"))

    // Output: belajar.oop.f06_generalfunction.p01.Computer@<kode hash>
    printObject(Computer("Dell"))

    // String juga turunan Any, jadi yang tercetak adalah isi tulisannya
    // Output: Angga Dwi Saputro
    printObject("Angga Dwi Saputro")
}
