package belajar.oop.f34_scopefunction.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Student(val name: String, val age: Int)

fun main() {
    val student = Student("Angga Dwi Saputro", 30)

    // let: objek tersedia sebagai 'it'. Hasil blok = nilai terakhir di dalam blok
    student.let {
        // Output: Angga Dwi Saputro
        println(it.name)

        // Output: 30
        println(it.age)
    }
}
