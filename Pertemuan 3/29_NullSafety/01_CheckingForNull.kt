package belajar.oop.f29_nullsafety.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Friend(val name: String)

// Parameter bertipe Friend? = boleh null
fun sayHello(friend: Friend?): Unit {
    // Cek dulu apakah tidak null, baru boleh mengakses friend.name
    if (friend != null) {
        println("Hello ${friend.name}")
    }
}

fun main() {
    // Output: Hello Angga Dwi Saputro
    sayHello(Friend("Angga Dwi Saputro"))

    // Objek null: tidak masuk ke if, jadi tidak ada yang tercetak
    sayHello(null)
}
