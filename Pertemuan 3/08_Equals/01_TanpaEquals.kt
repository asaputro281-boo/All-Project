package belajar.oop.f08_equals.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Company(val name: String)

fun main() {
    val company1 = Company("Angga Dwi Saputro")
    val company2 = Company("Angga Dwi Saputro")

    // Operator '==' memanggil equals(). Bawaan Any membandingkan alamat memori (bukan isi)
    // Karena keduanya objek berbeda di memori, hasilnya false walaupun isinya sama
    // Output: false
    println(company1 == company2) // false
}
