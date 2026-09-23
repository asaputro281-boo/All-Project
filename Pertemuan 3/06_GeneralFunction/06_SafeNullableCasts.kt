package belajar.oop.f06_generalfunction.p06 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

fun printString(any: Any) {
    // 'as?' = cast yang aman. Bila gagal, hasilnya null dan program tetap berjalan
    // Karena bisa null, tipe variabelnya String? (nullable)
    val value: String? = any as? String
    println(value)
}

fun main() {
    // Output: Angga Dwi Saputro
    printString("Angga Dwi Saputro") // success

    // Output: null   (angka 1 bukan String, jadi hasilnya null dan tidak error)
    printString(1) // null
}
