package belajar.oop.f11_gettersetter.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class BigNote(val title: String) {
    // 'bigTitle' tidak menyimpan nilai sendiri. Setiap dibaca, getter menghitung title dalam huruf kapital
    val bigTitle: String
        get() = title.uppercase()
}

fun main() {
    val bigNote = BigNote("My Diary Note")

    // Output: My Diary Note
    println(bigNote.title)

    // Output: MY DIARY NOTE
    println(bigNote.bigTitle)
}
