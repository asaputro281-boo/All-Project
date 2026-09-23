package belajar.oop.f03_employee.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

// Manager masih 'open', jadi boleh diwarisi lagi
open class Manager(name: String) : Employee(name) {
    // 'final override' = meng-override function induk, sekaligus melarang class turunan Manager meng-override lagi
    final override fun sayHello(name: String) {
        println("Hello $name, my name is manager ${this.name}")
    }
}

fun main() {
    val angga = Manager("Angga Dwi Saputro")

    // Output: Hello Joko, my name is manager Angga Dwi Saputro
    angga.sayHello("Joko")
}
