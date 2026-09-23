package belajar.oop.f31_annotation.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)

// Memasang annotation @Fancy pada class MyApplication, dengan author = Angga Dwi Saputro
@Fancy(author = "Angga Dwi Saputro")
class MyApplication(val name: String, val version: Int) {

    // Function yang menyusun teks informasi aplikasi
    fun info(): String = "Application $name-$version"
}

fun main() {
    val app = MyApplication("Belajar", 1)

    // Output: Application Belajar-1
    println(app.info())
}
