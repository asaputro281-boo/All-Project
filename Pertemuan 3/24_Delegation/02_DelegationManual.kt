package belajar.oop.f24_delegation.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Base {
    fun sayHello(name: String)
}
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

// Delegate menerima objek Base lewat constructor
class Delegate(val base: Base) : Base {
    // Function ini hanya "melempar" pekerjaan ke objek 'base' (didelegasikan secara manual)
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
}

fun main() {
    val myBase = MyBase()
    val delegate = Delegate(myBase)

    // Delegate meneruskan panggilan ke MyBase
    // Output: Hello Angga Dwi Saputro
    delegate.sayHello("Angga Dwi Saputro")
}
