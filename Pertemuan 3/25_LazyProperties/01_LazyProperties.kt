package belajar.oop.f25_lazyproperties.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Lazy {
    // 'by lazy' = isi blok dijalankan hanya sekali, yaitu saat properti PERTAMA KALI dibaca
    // Nilai terakhir di blok (baris "Angga Dwi Saputro") menjadi nilai properti
    val name: String by lazy {
        println("Lazy call")
        "Angga Dwi Saputro"
    }
}

fun main() {
    val lazy = Lazy()
    // Pada titik ini blok lazy BELUM dijalankan (belum ada yang membaca name)

    // Pembacaan pertama: blok dijalankan (mencetak "Lazy call"), lalu nilainya dicetak
    // Output baris 1: Lazy call
    // Output baris 2: Angga Dwi Saputro
    println(lazy.name)

    // Pembacaan kedua: blok TIDAK dijalankan lagi, nilai yang sudah tersimpan langsung dipakai
    // Output: Angga Dwi Saputro
    println(lazy.name) // tidak memanggil "Lazy call" lagi, nilai sudah tersimpan
}
