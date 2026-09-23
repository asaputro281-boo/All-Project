package belajar.oop.f03_employee.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// 'open' membuat class boleh diwarisi. Secara default class di Kotlin bersifat final (tidak bisa diwarisi)
// Employee adalah class induk (parent)
open class Employee(val name: String) {
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

// Manager dan VicePresident adalah class anak (child) dari Employee
// Tanda ':' artinya mewarisi, dan Employee(name) memanggil constructor induk
// 'final' artinya class ini tidak boleh diwarisi lagi
final class Manager(name: String) : Employee(name)
final class VicePresident(name: String) : Employee(name);

// (File ini hanya berisi definisi class, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
