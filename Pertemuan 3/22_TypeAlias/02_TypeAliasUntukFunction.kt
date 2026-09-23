package belajar.oop.f22_typealias.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// StringSupplier = nama pendek untuk tipe function "tidak menerima parameter dan mengembalikan String"
typealias StringSupplier = () -> String

// Function yang menerima function lain (lambda) sebagai parameter
fun sayHello(supplier: StringSupplier) {
    // supplier() = menjalankan lambda untuk mendapatkan String-nya
    println("Hello ${supplier()}")
}

fun main() {
    // { "Angga Dwi Saputro" } adalah lambda yang mengembalikan String
    // Output: Hello Angga Dwi Saputro
    sayHello { "Angga Dwi Saputro" }
}
