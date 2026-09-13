// Deklarasi Infix Extension Function bernama 'to' untuk tipe String yang mengembalikan String (: String).
infix fun String.to(type: String): String {
    
    // Mengecek apakah nilai parameter 'type' sama dengan "UP".
    if (type == "UP") {
        
        // Mengubah teks 'this' ("Angga") menjadi huruf kapital semua ("ANGGA") lalu mengembalikannya.
        return this.uppercase()
        
    // Blok alternatif jika 'type' bukan "UP".
    } else {
        
        // Mengubah teks 'this' ("Angga") menjadi huruf kecil semua ("angga") lalu mengembalikannya.
        return this.lowercase()
    }
}

// Fungsi utama tempat program mulai berjalan.
fun main() {
    
    // Memanggil fungsi infix 'to' tanpa tanda titik (.) dan tanpa tanda kurung ().
    // "Angga" menjadi 'this', dan "UP" menjadi parameter 'type'. Hasilnya ("ANGGA") disimpan ke variabel 'result'.
    val result: String = "Angga" to "UP"
    
    // Mencetak isi variabel 'result' ("ANGGA") ke konsol.
    println(result)
}