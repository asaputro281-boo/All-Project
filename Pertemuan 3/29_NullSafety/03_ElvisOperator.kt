package belajar.oop.f29_nullsafety.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Friend(val name: String)

fun sayHello(friend: Friend?): Unit {
    // '?:' = Elvis operator. Jika hasil di kirinya null, pakai nilai di kanannya (di sini string kosong)
    val name = friend?.name ?: ""
    println("Hello $name")
}

fun main() {
    // Output: Hello Angga Dwi Saputro
    sayHello(Friend("Angga Dwi Saputro"))

    // Output: Hello     (name diganti string kosong, jadi hanya kata "Hello" yang tampil)
    sayHello(null)
}
