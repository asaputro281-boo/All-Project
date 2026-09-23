package belajar.oop.f02_student.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Student(val name: String) {

    // Versi 1: menerima 1 parameter
    fun sayHello(yourName: String): Unit {
        println("Hello $yourName, my name is $name")
    }

    // Versi 2: nama function sama, tetapi menerima 2 parameter (nama depan dan belakang)
    // Kotlin otomatis memilih versi yang cocok berdasarkan jumlah/tipe parameter yang dikirim
    fun sayHello(firstName: String, lastName: String): Unit {
        println("Hello $firstName $lastName, my name is $name")
    }

}

fun main() {
    val student = Student("Angga Dwi Saputro")

    // Memanggil versi 1 (1 parameter)
    // Output: Hello Budi, my name is Angga Dwi Saputro
    student.sayHello("Budi")

    // Memanggil versi 2 (2 parameter)
    // Output: Hello Joko Nugroho, my name is Angga Dwi Saputro
    student.sayHello("Joko", "Nugroho")
}
