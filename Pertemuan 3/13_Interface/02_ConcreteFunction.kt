package belajar.oop.f13_interface.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Interaction {
    val name: String

    // Function ini sudah punya isi, jadi class yang implement TIDAK wajib meng-override-nya
    fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name}")
    }
}

// Human hanya perlu mengisi property 'name'; sayHello() sudah didapat dari interface
class Human(override val name: String) : Interaction

fun main() {
    val human = Human("Angga Dwi Saputro")

    // Output: Hello Joko, my name is Angga Dwi Saputro
    human.sayHello("Joko")
}
