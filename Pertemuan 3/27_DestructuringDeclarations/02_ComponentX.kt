package belajar.oop.f27_destructuringdeclarations.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Game(val name: String, val price: Int)

fun main() {
    val game = Game("Zelda", 500_000)

    // val (name, price) = game
    // Baris di atas sebenarnya diterjemahkan Kotlin menjadi dua baris berikut:
    val name = game.component1()   // component1() = properti pertama (name)
    val price = game.component2()  // component2() = properti kedua (price)

    // Output: Zelda
    println(name)

    // Output: 500000
    println(price)
}
