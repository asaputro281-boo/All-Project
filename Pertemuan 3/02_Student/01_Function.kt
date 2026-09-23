package belajar.oop.f02_student.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Class Student dengan properti 'name' yang langsung dibuat lewat constructor
class Student(val name: String) {

    // Function milik class. Menerima 1 parameter (yourName) dan tidak mengembalikan nilai (Unit)
    fun sayHello(yourName: String): Unit {
        // $yourName dan $name = string template, otomatis diganti dengan nilai variabelnya
        println("Hello $yourName, my name is $name")
    }

}

fun main() {
    // Membuat objek Student bernama Angga Dwi Saputro
    val student = Student("Angga Dwi Saputro")

    // Memanggil function sayHello dengan mengirim nama "Budi"
    // Output: Hello Budi, my name is Angga Dwi Saputro
    student.sayHello("Budi")
}
