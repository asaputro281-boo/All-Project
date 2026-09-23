package belajar.oop.f11_gettersetter.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Note(title: String) {
    var title: String = title
        get() = field
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

fun main() {
    val note = Note("My Diary Note")

    // Mencoba mengisi title dengan string kosong. Setter menolaknya karena isNotBlank() = false
    note.title = "" // not change

    // Nilai lama tetap dipertahankan
    // Output: My Diary Note
    println(note.title)
}
