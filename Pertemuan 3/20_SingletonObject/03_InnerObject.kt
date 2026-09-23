package belajar.oop.f20_singletonobject.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Application(val name: String) {
    // Object di dalam class. Aksesnya lewat NamaClass.NamaObject
    object Utilities {
        fun hello(name: String): Unit {
            println("Hello $name")
        }
    }
}

fun main() {
    // Tidak perlu membuat objek Application, cukup Application.Utilities.hello(...)
    // Output: Hello Angga Dwi Saputro
    Application.Utilities.hello("Angga Dwi Saputro")
}
