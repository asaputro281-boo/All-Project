package belajar.oop.f34_scopefunction.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Student(val name: String, val age: Int)

fun main() {
    val student = Student("Angga Dwi Saputro", 30)

    // run: objek menjadi 'this' (kata 'this' juga boleh dihilangkan). Hasil blok = nilai terakhir
    student.run {
        // Output: Angga Dwi Saputro
        println(this.name)

        // Output: 30
        println(this.age)
    }
}
