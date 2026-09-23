package belajar.oop.f02_student.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Student(val name: String) {

    // Parameter 'name' memiliki nama yang sama dengan properti 'name' milik class
    fun sayHello(name: String): Unit {
        // $name yang dipakai di sini adalah PARAMETER (yang paling dekat), bukan properti class
        // Akibatnya kedua $name berisi nilai yang sama
        println("Hello $name, my name is $name")
    }

}

fun main() {
    val student = Student("Angga Dwi Saputro")

    // Output: Hello Joko, my name is Joko   (hasil yang salah, seharusnya my name is Angga Dwi Saputro)
    student.sayHello("Joko")
}
