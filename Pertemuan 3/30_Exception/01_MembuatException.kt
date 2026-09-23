package belajar.oop.f30_exception.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Exception buatan sendiri. Mewarisi Throwable agar bisa dilempar dengan 'throw'
class ValidationException(message: String) : Throwable(message)

fun sayHello(name: String) {
    // Jika name kosong/spasi saja, lempar error dengan pesan "Name is blank"
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    }
    println("Hello $name")
}

fun main() {
    // Output: Hello Angga Dwi Saputro
    sayHello("Angga Dwi Saputro")

    // sayHello("") // melempar ValidationException - hapus // untuk mencoba error
}
