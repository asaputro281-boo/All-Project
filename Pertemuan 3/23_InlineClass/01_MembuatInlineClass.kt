package belajar.oop.f23_inlineclass.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Versi di slide (sudah deprecated di Kotlin terbaru):
// inline class Token(val value: String) {
//     fun toUpper(): String = value.toUpperCase()
// }

// Versi modern yang setara:
// @JvmInline + 'value class' = class pembungkus 1 nilai. Saat dijalankan, Kotlin cukup memakai nilai String-nya
// sehingga lebih hemat memori, tetapi di kode tetap punya tipe khusus (Token)
@JvmInline
value class Token(val value: String) {
    // Function di dalam value class untuk mengubah token menjadi huruf kapital
    fun toUpper(): String = value.uppercase()
}

fun main() {
    val login = Token("secret token")

    // Output: SECRET TOKEN
    println(login.toUpper())
}
