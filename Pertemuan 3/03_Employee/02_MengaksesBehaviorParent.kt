package belajar.oop.f03_employee.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

open class Employee(val name: String) {
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

final class Manager(name: String) : Employee(name)
final class VicePresident(name: String) : Employee(name);

fun main() {
    // Manager tidak punya function sayHello sendiri, tetapi mewarisinya dari Employee
    val angga = Manager("Angga Dwi Saputro");

    // Output: Hello Joko, my name is Angga Dwi Saputro
    angga.sayHello("Joko")

    val budi = VicePresident("Budi")

    // Output: Hello Joko, my name is Budi
    budi.sayHello("Joko")
}
