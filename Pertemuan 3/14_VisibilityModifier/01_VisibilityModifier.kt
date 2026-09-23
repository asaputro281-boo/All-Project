package belajar.oop.f14_visibilitymodifier.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Teacher {
    // 'private' = function ini hanya bisa dipakai di dalam class Teacher
    // Pilihan modifier lain di Kotlin: public (default), protected, internal
    private fun teach() {
        println("Teach")
    }
}

fun main() {
    val teacher = Teacher()

    // teacher.teach() // error: teach() bersifat private
    // Baris di atas dijadikan komentar karena akan menyebabkan error saat compile
}
