package belajar.oop.f06_generalfunction.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Laptop(val brand: String)
class Computer(val brand: String)

fun printObject(any: Any) {
    // 'is' dipakai untuk mengecek apakah objek adalah instance dari class tertentu
    if (any is Laptop) {
        // Blok ini dijalankan bila objek berupa Laptop (di sini sengaja dikosongkan)
    } else if (any is Computer) {
        // Blok ini dijalankan bila objek berupa Computer (di sini sengaja dikosongkan)
    } else {
        // Selain Laptop dan Computer, langsung dicetak
        println(any)
    }
}

fun main() {
    // Laptop dan Computer masuk ke blok kosong, jadi tidak ada yang tercetak
    printObject(Laptop("Apple"))
    printObject(Computer("Dell"))

    // Output: Angga Dwi Saputro   (masuk ke blok else)
    printObject("Angga Dwi Saputro")
}
