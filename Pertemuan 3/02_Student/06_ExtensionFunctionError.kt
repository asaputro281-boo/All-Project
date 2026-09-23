package belajar.oop.f02_student.p06 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// 'age' bersifat private, artinya hanya bisa diakses dari dalam class Student sendiri
class Student(val name: String, private val age: Int)

fun Student.sayGoodBye(name: String) {
    // ERROR: extension function tidak bisa mengakses private member
    // println("GoodBye $name, my age is ${this.age}") // error
    // Baris di atas sengaja dijadikan komentar supaya program tidak error

    // Yang boleh diakses hanya member public seperti 'name'
    println("GoodBye $name, my name is ${this.name}")
}

fun main() {
    val angga = Student("Angga Dwi Saputro", 12)

    // Output: GoodBye Joko, my name is Angga Dwi Saputro
    angga.sayGoodBye("Joko")
}
