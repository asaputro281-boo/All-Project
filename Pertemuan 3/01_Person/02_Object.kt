package belajar.oop.f01_person.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Class Person (masih kosong) sebagai cetakan objek
class Person

// Fungsi main() adalah titik awal program dijalankan
fun main() {
    // Membuat object dari class Person dan menyimpannya di variabel 'angga'
    // Person() artinya memanggil constructor default untuk membuat objek baru
    val angga = Person()

    // Mencetak objek ke layar. Karena Person tidak punya toString(), yang tampil adalah nama class + alamat memori (hash)
    // Output: belajar.oop.f01_person.p02.Person@<kode hash>  (kode hash-nya bisa berbeda tiap dijalankan)
    println(angga)
}
