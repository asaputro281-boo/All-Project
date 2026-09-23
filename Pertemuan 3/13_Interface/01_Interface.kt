package belajar.oop.f13_interface.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Interface hanya berisi "aturan" apa yang harus ada, bukan cara kerjanya
interface Interaction {
    val name: String                    // property abstract: wajib diisi oleh class yang implement
    fun sayHello(name: String): Unit    // function abstract: wajib dibuat isinya oleh class yang implement
}

// Human mengimplementasikan Interaction (tanda ':' di sini berarti implement interface)
class Human(override val name: String) : Interaction {
    // Wajib meng-override function sayHello sesuai kontrak interface
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

fun main() {
    val human = Human("Angga Dwi Saputro")

    // Output: Hello Joko, my name is Angga Dwi Saputro
    human.sayHello("Joko")
}
