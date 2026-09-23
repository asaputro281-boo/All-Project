package belajar.oop.f13_interface.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Interaction {
    val name: String
    fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go {
    fun go(): Unit {
        println("Go!")
    }
}

// Menggabungkan dua interface dengan tanda koma. (Class biasa hanya boleh mewarisi 1 class, tetapi boleh banyak interface)
class Human(override val name: String) : Interaction, Go

fun main() {
    val human = Human("Angga Dwi Saputro")

    // Output: Hello Joko, my name is Angga Dwi Saputro
    human.sayHello("Joko")

    // Output: Go!
    human.go()
}
