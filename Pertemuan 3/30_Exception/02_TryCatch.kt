package belajar.oop.f30_exception.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class ValidationException(message: String) : Throwable(message)

fun sayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    }
    println("Hello $name")
}

fun main() {
    try {
        // Kode yang berpotensi menimbulkan error ditaruh di dalam try

        // Output: Hello Angga Dwi Saputro
        sayHello("Angga Dwi Saputro")

        // Name kosong -> melempar ValidationException, langsung lompat ke catch
        sayHello("")
    } catch (error: ValidationException) {
        // catch dijalankan ketika ValidationException terjadi
        // Output: Error with message Name is blank
        println("Error with message ${error.message}")
    }
}
