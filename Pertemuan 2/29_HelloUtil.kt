package angga.util

fun sayHello(name: String) {
    println("Hello $name")
}

fun sayHello(firstName: String, lastName: String) {
    println("Hello $firstName $lastName")
}

fun main() {
    // Memanggil fungsi overload pertama
    sayHello("Angga")

    // Memanggil fungsi overload kedua
    sayHello("Dwi", "Saputro")
}