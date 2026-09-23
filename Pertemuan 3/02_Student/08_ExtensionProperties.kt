package belajar.oop.f02_student.p08 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Student(val name: String, private val age: Int)

// EXTENSION PROPERTY: properti baru 'upperName' untuk Student
// 'get()' menentukan cara nilainya dihitung, yaitu name diubah menjadi huruf kapital semua
val Student.upperName: String
    get() = this.name.uppercase()

fun main() {
    val angga: Student = Student("Angga Dwi Saputro", 12)

    // Output: ANGGA DWI SAPUTRO
    println(angga.upperName)
}
