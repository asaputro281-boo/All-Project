package belajar.oop.f21_companionobject.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Application(val name: String) {
    // 'companion object' = object pendamping class. Isinya bisa diakses langsung lewat nama class
    // (mirip static di Java). Setiap class hanya boleh punya satu companion object
    companion object {
        fun hello(name: String): Unit {
            println("Hello $name")
        }
    }
}

fun main() {
    // Cara singkat: langsung lewat nama class
    // Output: Hello Angga Dwi Saputro
    Application.hello("Angga Dwi Saputro")

    // Cara lengkap: menyebut 'Companion' secara eksplisit (hasilnya sama)
    // Output: Hello Angga Dwi Saputro
    Application.Companion.hello("Angga Dwi Saputro")
}
