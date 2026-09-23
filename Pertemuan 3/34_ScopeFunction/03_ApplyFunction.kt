package belajar.oop.f34_scopefunction.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Student(val name: String, val age: Int)

fun main() {
    // apply: menjalankan blok pada objek, lalu mengembalikan objek yang sama
    // Cocok untuk mengatur/menginisialisasi objek setelah dibuat
    val student: Student = Student("Angga Dwi Saputro", 30).apply {
        // Output: Angga Dwi Saputro
        println(this.name)

        // Output: 30
        println(this.age)
    }

    // Objek Student dikembalikan oleh apply, sehingga bisa ditampilkan
    // Output: Student(name=Angga Dwi Saputro, age=30)
    println(student)
}
