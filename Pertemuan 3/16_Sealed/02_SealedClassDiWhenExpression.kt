package belajar.oop.f16_sealed.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

sealed class Operation(val name: String)
class Plus : Operation("Add")
class Minus : Operation("Minus")

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    // Karena Operation adalah sealed class, compiler tahu hanya ada Plus dan Minus
    // Jadi 'when' tidak butuh 'else'
    return when (operation) {
        is Plus -> value1 + value2    // jika Plus, jumlahkan
        is Minus -> value1 - value2   // jika Minus, kurangkan
    }
}

fun main() {
    // Output: 15   (10 + 5)
    println(operation(10, 5, Plus()))

    // Output: 5    (10 - 5)
    println(operation(10, 5, Minus()))
}
