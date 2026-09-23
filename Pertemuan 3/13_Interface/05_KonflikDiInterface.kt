package belajar.oop.f13_interface.p05 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Interaction {
    val name: String
    fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go : Interaction {
    fun go(): Unit {
        println("Go ${this.name}!")
    }
}

// Dua interface di bawah sama-sama punya function move() dengan isi berbeda
interface MoveA {
    fun move(): Unit = println("Move A")
}
interface MoveB {
    fun move(): Unit = println("Move B")
}

// ERROR: Human mewarisi function move() dari MoveA dan MoveB (konflik).
// Hapus tanda komentar di bawah untuk melihat error-nya.
// Kotlin bingung memilih move() yang mana, jadi Human wajib meng-override move() sendiri
// class Human(override val name: String) : Go, MoveA, MoveB

fun main() {
    // Output: Lihat file berikutnya (06_MemperbaikiKonflikDiInterface) untuk solusinya.
    println("Lihat file berikutnya (06_MemperbaikiKonflikDiInterface) untuk solusinya.")
}
