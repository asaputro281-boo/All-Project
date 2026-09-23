package belajar.oop.f04_shape.p05 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

open class Shape(val name: String, val shape: Int, val color: String) {
    constructor(name: String, shape: Int) : this(name, shape, "")
    constructor(name: String) : this(name, -1)
}

// Rectangle tidak punya primary constructor, jadi tiap constructor-nya wajib memanggil super(...)
class Rectangle : Shape {
    // Memanggil constructor Shape dengan 2 parameter (name, shape)
    constructor() : super("Rectangle", 4)

    // Memanggil constructor Shape dengan 3 parameter (name, shape, color)
    constructor(color: String) : super("Rectangle", 4, color)
}

fun main() {
    val rectangle1 = Rectangle()
    val rectangle2 = Rectangle("Red")

    // Output: Rectangle 4 ''      (warna kosong)
    println("${rectangle1.name} ${rectangle1.shape} '${rectangle1.color}'")

    // Output: Rectangle 4 'Red'
    println("${rectangle2.name} ${rectangle2.shape} '${rectangle2.color}'")
}
