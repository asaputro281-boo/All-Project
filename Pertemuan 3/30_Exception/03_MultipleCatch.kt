package belajar.oop.f30_exception.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

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

        // Melempar ValidationException
        sayHello("")
    } catch (error: ValidationException) {
        // Menangani error jenis ValidationException
        // Output: Error with message Name is blank
        println("Error with message ${error.message}")
    } catch (error: NullPointerException) {
        // Menangani error jenis NullPointerException (tidak terjadi pada contoh ini)
        println("Error with message ${error.message}")
    }
}
