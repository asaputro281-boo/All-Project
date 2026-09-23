package belajar.oop.f10_abstractpropertyfunction.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

abstract class Animal {
    abstract val name: String
    abstract fun run(): Unit
}

// Cat mewarisi Animal, sehingga WAJIB meng-override semua member yang abstract
class Cat : Animal() {
    override val name: String = "Cat"        // mengisi property abstract
    override fun run() {                     // mengisi function abstract
        println("Cat run!")
    }
}

fun main() {
    val cat = Cat()

    // Output: Cat
    println(cat.name)

    // Output: Cat run!
    cat.run()
}
