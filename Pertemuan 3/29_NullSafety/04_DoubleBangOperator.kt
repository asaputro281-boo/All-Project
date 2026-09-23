package belajar.oop.f29_nullsafety.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Friend(val name: String)

fun sayHello(friend: Friend?): Unit {
    // '!!' = "saya yakin ini tidak null". Jika ternyata null, program error (NullPointerException)
    // Sebaiknya dipakai seminimal mungkin
    val name = friend!!.name
    println("Hello $name")
}

fun main() {
    // Output: Hello Angga Dwi Saputro
    sayHello(Friend("Angga Dwi Saputro"))

    // sayHello(null) // NullPointerException - hapus // untuk mencoba error
}
