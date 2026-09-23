package belajar.oop.f27_destructuringdeclarations.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Data class penampung hasil: nilai minimum dan maksimum
data class MinMax(val min: Int, val max: Int)

// Function membandingkan dua angka lalu mengembalikan keduanya dalam urutan kecil -> besar
fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)   // jika value1 lebih besar, tukar posisinya
        else -> MinMax(value1, value2)              // selain itu, urutan sudah benar
    }
}

fun main() {
    val result = minmax(1000, 100)

    // Output: MinMax(min=100, max=1000)
    println(result)
}
