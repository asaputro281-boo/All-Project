package belajar.oop.f33_reflection.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Import untuk fitur reflection (butuh library kotlin-reflect saat dijalankan)
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

class Sample(val name: String = "Sample") {
    fun hello() = println("Hello from $name")
}

fun main() {
    val sample = Sample()

    // sample::class = mengambil "informasi class" dari objek (KClass)
    val clazz = sample::class

    val constructors = clazz.constructors        // daftar constructor
    val functions = clazz.memberFunctions        // daftar function milik class
    val parameters = clazz.memberProperties      // daftar properti milik class
    val annotations = clazz.annotations          // daftar annotation yang dipasang pada class

    // Output: Class       : Sample
    println("Class       : ${clazz.simpleName}")

    // Output: Constructors: [fun `<init>`(kotlin.String): belajar.oop.f33_reflection.p01.Sample]
    println("Constructors: $constructors")

    // Output: Functions   : [hello, equals, hashCode, toString]  (urutan bisa berbeda tergantung versi Kotlin)
    println("Functions   : ${functions.map { it.name }}")

    // Output: Properties  : [name]
    println("Properties  : ${parameters.map { it.name }}")

    // Output: Annotations : []   (tidak ada annotation pada class Sample)
    println("Annotations : $annotations")
}
