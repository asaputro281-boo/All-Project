package belajar.oop.f04_shape.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

open class Shape {
    open val corner: Int = -1
}

class Rectangle : Shape() {
    override val corner: Int = 4

    // 'super.corner' = mengambil nilai corner milik class induk (Shape), bukan milik Rectangle
    val parentCorner: Int = super.corner
}

fun main() {
    val rectangle = Rectangle()

    // Output: 4
    println(rectangle.corner)

    // Output: -1  (nilai milik induk)
    println(rectangle.parentCorner)
}
