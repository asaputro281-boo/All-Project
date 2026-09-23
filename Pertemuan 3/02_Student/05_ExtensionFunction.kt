package belajar.oop.f02_student.p05 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Student(val name: String) {

    fun sayHello(name: String): Unit {
        println("Hello $name, my name is ${this.name}")
    }

}

// EXTENSION FUNCTION: menambahkan function sayGoodBye() ke class Student dari luar class
// Penulisannya 'Student.namaFunction'. Di dalamnya, 'this' merujuk ke objek Student yang memanggil
fun Student.sayGoodBye(name: String) {
    println("GoodBye $name, my name is ${this.name}")
}

fun main() {
    val angga = Student("Angga Dwi Saputro")

    // Memanggil extension function seolah-olah function bawaan class Student
    // Output: GoodBye Joko, my name is Angga Dwi Saputro
    angga.sayGoodBye("Joko")
}
