package belajar.oop.f22_typealias.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Student(val name: String, val age: Int)

// 'typealias' membuat nama panggilan baru. Pelajar dan Murid sama saja dengan Student
typealias Pelajar = Student
typealias Murid = Pelajar   // alias dari alias juga boleh

fun main() {
    // Membuat objek memakai nama alias
    val pelajar = Pelajar("Angga Dwi Saputro", 15)
    val murid = Murid("Rudi", 10)

    // Output: Angga Dwi Saputro - 15
    println("${pelajar.name} - ${pelajar.age}")

    // Output: Rudi - 10
    println("${murid.name} - ${murid.age}")
}
