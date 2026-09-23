package belajar.oop.f13_interface.p06 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

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

interface MoveA {
    fun move(): Unit = println("Move A")
}
interface MoveB {
    fun move(): Unit = println("Move B")
}

class Human(override val name: String) : Go, MoveA, MoveB {
    // Solusi konflik: override move() sendiri
    override fun move() {
        // super<MoveA> = panggil move() milik interface MoveA
        super<MoveA>.move()
        // super<MoveB> = panggil move() milik interface MoveB
        super<MoveB>.move()
    }
}

fun main() {
    val human = Human("Angga Dwi Saputro")

    // Output baris 1: Move A
    // Output baris 2: Move B
    human.move()
}
