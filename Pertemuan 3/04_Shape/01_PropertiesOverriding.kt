package belajar.oop.f04_shape.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

open class Shape {
    // Properti 'open' boleh di-override. Nilai default -1 = jumlah sudut belum diketahui
    open val corner: Int = -1
}

class Rectangle : Shape() {
    // Menimpa nilai corner menjadi 4 (persegi panjang punya 4 sudut)
    override val corner: Int = 4
}

fun main() {
    val shape = Shape()
    val rectangle = Rectangle()

    // Output: -1
    println(shape.corner)

    // Output: 4
    println(rectangle.corner)
}
