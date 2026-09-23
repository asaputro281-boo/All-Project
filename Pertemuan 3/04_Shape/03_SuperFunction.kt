package belajar.oop.f04_shape.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

open class Shape {
    open val corner: Int = -1
    open fun printName() {
        println("This is Shape")
    }
}

class Rectangle : Shape() {
    override val corner: Int = 4
    val parentCorner: Int = super.corner

    override fun printName() {
        println("This is Rectangle, with parent =>")

        // 'super.printName()' = menjalankan versi function milik Shape (induk)
        super.printName()
    }
}

fun main() {
    val rectangle = Rectangle()

    // Output baris 1: This is Rectangle, with parent =>
    // Output baris 2: This is Shape
    rectangle.printName()
}
