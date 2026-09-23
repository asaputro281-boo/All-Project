package belajar.oop.f24_delegation.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Base {
    fun sayHello(name: String)
}

// Implementasi asli dari interface Base
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

fun main() {
    val myBase = MyBase()

    // Output: Hello Angga Dwi Saputro
    myBase.sayHello("Angga Dwi Saputro")
}
