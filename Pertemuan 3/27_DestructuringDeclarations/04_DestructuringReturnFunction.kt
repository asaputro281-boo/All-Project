package belajar.oop.f27_destructuringdeclarations.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class MinMax(val min: Int, val max: Int)

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun main() {

    // Hasil function langsung dipecah menjadi dua variabel: min dan max
    val (min, max) = minmax(1000, 100)

    // Output: 100
    println(min) // 100

    // Output: 1000
    println(max) // 1000
}
