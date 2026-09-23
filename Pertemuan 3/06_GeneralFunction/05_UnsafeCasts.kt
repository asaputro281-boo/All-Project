package belajar.oop.f06_generalfunction.p05 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

fun printString(any: Any) {
    // 'as String' memaksa 'any' menjadi String. Jika ternyata bukan String, program melempar ClassCastException
    val value = any as String
    println(value)
}

fun main() {
    // Berhasil karena isinya memang String
    // Output: Angga Dwi Saputro
    printString("Angga Dwi Saputro") // success

    // printString(1) // ClassCastException  (hapus tanda // untuk mencoba error)
    // Error terjadi karena angka 1 (Int) tidak bisa di-cast menjadi String
}
