package belajar.oop.f24_delegation.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Base {
    fun sayHello(name: String)
}
class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

// ': Base by base' = semua function Base otomatis diteruskan ke objek 'base'
// Tidak perlu menulis override satu per satu seperti pada cara manual
class Delegate(val base: Base) : Base by base

fun main() {
    val myBase = MyBase()
    val delegate = Delegate(myBase)

    // Output: Hello Angga Dwi Saputro
    delegate.sayHello("Angga Dwi Saputro")
}
