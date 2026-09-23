package belajar.oop.f09_abstract.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// 'abstract' = class setengah jadi, dipakai sebagai kerangka untuk class turunan
abstract class Location(val name: String)

// City mewarisi Location, sehingga City boleh dibuat objeknya
class City(name: String) : Location(name)

fun main() {
    // val location = Location("Angga Dwi Saputro") // error: abstract class tidak bisa dibuat objek
    // Baris di atas dijadikan komentar karena akan menyebabkan error saat compile

    val city = City("Jakarta")

    // Output: Jakarta
    println(city.name)
}
