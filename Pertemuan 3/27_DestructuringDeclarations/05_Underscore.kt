package belajar.oop.f27_destructuringdeclarations.p05 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class MinMax(val min: Int, val max: Int)

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun main() {

    // '_' artinya nilai kedua (max) tidak dipakai sehingga tidak dibuatkan variabel
    val (min, _) = minmax(1000, 100)

    // Output: 100
    println(min) // 100
}
