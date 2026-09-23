package belajar.oop.f02_student.p07 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Student(val name: String, private val age: Int)

// 'Student?' (pakai tanda tanya) artinya function ini bisa dipanggil pada objek yang bernilai null
fun Student?.sayGoodBye(name: String) {
    // Karena objek bisa null, harus dicek dulu sebelum dipakai
    if (this != null) {
        // Hanya dijalankan jika objek Student tidak null
        println("GoodBye $name, my age is ${this.name}") // (teks 'age' di slide, tetapi yang dicetak sebenarnya name)
    }
}

fun main() {
    // Variabel bertipe Student? (nullable), saat ini berisi objek Student
    val angga: Student? = Student("Angga Dwi Saputro", 12)

    // Karena tidak null, isi if dijalankan
    // Output: GoodBye Joko, my age is Angga Dwi Saputro
    angga.sayGoodBye("Joko")
}
