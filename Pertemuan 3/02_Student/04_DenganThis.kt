package belajar.oop.f02_student.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Student(val name: String) {

    fun sayHello(name: String): Unit {
        // $name       = parameter function
        // ${this.name} = properti milik class (this = objek itu sendiri)
        println("Hello $name, my name is ${this.name}")
    }

}

fun main() {
    val student = Student("Angga Dwi Saputro")

    // Output: Hello Joko, my name is Angga Dwi Saputro
    student.sayHello("Joko")
}
