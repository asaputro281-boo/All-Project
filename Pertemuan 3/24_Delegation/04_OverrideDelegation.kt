package belajar.oop.f24_delegation.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Base {
    fun sayHello(name: String)
}
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Delegate(val base: Base) : Base by base {
    // Function ini ditimpa, sehingga TIDAK diteruskan ke 'base' lagi, tetapi memakai versi sendiri
    override fun sayHello(name: String) {
        println("Delegate Hello $name")
    }
}

fun main() {
    val myBase = MyBase()
    val delegate = Delegate(myBase)

    // Output: Delegate Hello Angga Dwi Saputro
    delegate.sayHello("Angga Dwi Saputro")
}
