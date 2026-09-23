package belajar.oop.f34_scopefunction.p05 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Student(val name: String, val age: Int)

fun main() {
    val student: Student = Student("Angga Dwi Saputro", 30)

    // with bukan extension function: bentuknya with(objek) { ... }. Di dalam blok, objek menjadi 'this'
    with(student) {
        // Output: Angga Dwi Saputro
        println(this.name)

        // Output: 30
        println(this.age)
    }
}
