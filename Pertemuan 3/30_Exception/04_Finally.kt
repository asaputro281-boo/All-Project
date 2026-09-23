package belajar.oop.f30_exception.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class ValidationException(message: String) : Throwable(message)

fun sayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    }
    println("Hello $name")
}

fun main() {
    try {
        // Output: Hello Angga Dwi Saputro
        sayHello("Angga Dwi Saputro")

        sayHello("")
    } catch (error: ValidationException) {
        // Output: Error with message Name is blank
        println("Error with message ${error.message}")
    } finally {
        // finally SELALU dijalankan, biasanya dipakai untuk "bersih-bersih" seperti menutup file/koneksi
        // Output: Finally will always be executed
        println("Finally will always be executed")
    }
}
