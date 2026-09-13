// Deklarasi package untuk mengelompokkan kode ke dalam namespace 'angga.util'.
package angga.util

// Fungsi 'sayHello' pertama: menerima 1 parameter 'name' (String).
fun sayHello(name: String) {
    println("Hello $name")
}

// Fungsi 'sayHello' kedua: menerima 2 parameter 'firstName' dan 'lastName' (String).
fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

fun main() {
    // Memanggil 'sayHello' versi 1 parameter menggunakan Named Argument ("Hello Angga").
    sayHello(name = "Angga")

    // Memanggil 'sayHello' versi 2 parameter ("Hello Dwi Saputro").
    sayHello("Dwi", "Saputro")
}