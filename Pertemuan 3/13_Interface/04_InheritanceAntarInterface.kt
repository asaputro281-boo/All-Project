package belajar.oop.f13_interface.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Interaction {
    val name: String
    fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name}")
    }
}

// Interface Go mewarisi Interaction, sehingga otomatis punya 'name' dan sayHello()
interface Go : Interaction {
    fun go(): Unit {
        println("Go ${this.name}!")
    }
}

// Human cukup implement Go, otomatis dapat semua milik Interaction juga
class Human(override val name: String) : Go

fun main() {
    val human = Human("Angga Dwi Saputro")

    // Output: Hello Joko, my name is Angga Dwi Saputro
    human.sayHello("Joko")

    // Output: Go Angga Dwi Saputro!
    human.go()
}
