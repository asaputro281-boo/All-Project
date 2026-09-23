package belajar.oop.f20_singletonobject.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

object Utilities {
    val name = "Utilities"
    fun toUpper(value: String): String {
        return value.uppercase()
    }
}

fun main() {
    // Dipanggil langsung dengan NamaObject.function(), tanpa membuat objek dengan Utilities()
    val result = Utilities.toUpper("Angga Dwi Saputro")

    // Output: ANGGA DWI SAPUTRO
    println(result)

    // Output: Utilities
    println(Utilities.name)
}
