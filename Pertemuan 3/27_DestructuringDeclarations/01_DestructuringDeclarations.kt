package belajar.oop.f27_destructuringdeclarations.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Game(val name: String, val price: Int)

fun main() {
    val game = Game("Zelda", 500_000)

    // Memecah objek 'game' ke dua variabel: name (dari properti pertama) dan price (properti kedua)
    // Urutannya sesuai urutan properti di constructor data class
    val (name, price) = game

    // Output: Zelda
    println(name)

    // Output: 500000
    println(price)
}
