package belajar.oop.f07_car.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Car(val name: String) {

    // Menimpa toString() bawaan Any agar println(car) menampilkan teks buatan sendiri
    override fun toString(): String {
        return "Car with name $name"
    }
}

fun main() {
    val car = Car("Avanza")

    // println otomatis memanggil toString()
    // Output: Car with name Avanza
    println(car)
}
