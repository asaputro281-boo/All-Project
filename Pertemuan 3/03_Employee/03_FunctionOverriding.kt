package belajar.oop.f03_employee.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

open class Employee(val name: String) {
    // 'open' pada function = function ini boleh di-override oleh class anak
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

final class Manager(name: String) : Employee(name) {
    // 'override' = menimpa function milik induk dengan versi sendiri
    override fun sayHello(name: String) {
        println("Hello $name, my name is manager ${this.name}")
    }
}

final class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is vice president ${this.name}")
    }
}

fun main() {
    val angga = Manager("Angga Dwi Saputro")

    // Output: Hello Joko, my name is manager Angga Dwi Saputro
    angga.sayHello("Joko")

    val budi = VicePresident("Budi")

    // Output: Hello Joko, my name is vice president Budi
    budi.sayHello("Joko")
}
