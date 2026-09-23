package belajar.oop.f29_nullsafety.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Friend(val name: String)

fun sayHello(friend: Friend?): Unit {
    // '?.' = safe call. Jika friend null, seluruh ekspresi menghasilkan null (tidak error)
    println("Hello ${friend?.name}")
}

fun main() {
    // Output: Hello Angga Dwi Saputro
    sayHello(Friend("Angga Dwi Saputro"))

    // Output: Hello null
    sayHello(null)
}
