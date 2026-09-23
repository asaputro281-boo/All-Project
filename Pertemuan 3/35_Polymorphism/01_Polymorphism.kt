package belajar.oop.f35_polymorphism.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

// Manager dan VicePresident meng-override sayHello() dengan perilaku masing-masing
class Manager(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is manager ${this.name}")
    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, my name is vice president ${this.name}")
    }
}

fun main() {
    // Variabel bertipe Employee (induk). Isi awalnya objek Employee biasa
    var employee: Employee = Employee("Angga Dwi Saputro")

    // Output: Hello Budi, my name is Angga Dwi Saputro
    employee.sayHello("Budi")

    // Variabel yang sama sekarang diisi objek Manager (class turunan)
    employee = Manager("Angga Dwi Saputro")

    // Yang dijalankan adalah sayHello() milik Manager, sesuai objek aslinya
    // Output: Hello Budi, my name is manager Angga Dwi Saputro
    employee.sayHello("Budi")

    // Sekarang diisi objek VicePresident
    employee = VicePresident("Angga Dwi Saputro")

    // Output: Hello Budi, my name is vice president Angga Dwi Saputro
    employee.sayHello("Budi")
}
