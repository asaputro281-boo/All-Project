package belajar.oop.f34_scopefunction.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Student(val name: String, val age: Int)

fun main() {
    // also: mirip apply, tetapi objek dipanggil dengan 'it'. Cocok untuk aksi tambahan seperti logging
    val student: Student = Student("Angga Dwi Saputro", 30).also {
        // Output: Angga Dwi Saputro
        println(it.name)

        // Output: 30
        println(it.age)
    }

    // Output: Student(name=Angga Dwi Saputro, age=30)
    println(student)
}
