// Faktorial dengan perulangan (Looping)
fun factorialLoop(value: Int): Int {
    var result = 1
    // Mengalikan angka dari 'value' turun sampai 1 secara berurutan
    for (i in value downTo 1) {
        result *= i
    }
    return result
}

// Faktorial dengan fungsi rekursif (memanggil diri sendiri)
fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1 // Kondisi berhenti saat angka mencapai 1
        else -> value * factorialRecursive(value = value - 1) // Memanggil fungsi dirinya sendiri
    }
}

fun main() {
    // Mencetak hasil faktorial 5 dari perulangan (120)
    println("Hasil Factorial Loop: ${factorialLoop(5)}")

    // Mencetak hasil faktorial 5 dari rekursif (120)
    println("Hasil Factorial Recursive: ${factorialRecursive(5)}")
}