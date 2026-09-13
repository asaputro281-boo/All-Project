// Deklarasi fungsi 'finalValue' dengan parameter biasa 'name' (String) dan parameter 'vararg values' (Int) yang bisa menerima banyak angka sekaligus.
fun finalValue(name: String, vararg values: Int) {
    
    // Mengecek apakah data angka pada 'values' kosong (tidak ada input angka).
    if (values.isEmpty()) {
        
        // Menampilkan pesan bahwa nilai tidak ada untuk nama tersebut.
        println("Tidak ada nilai untuk $name")
        
        // Menghentikan dan keluar dari fungsi lebih awal jika data kosong.
        return
    }

    // Variabel penampung total penjumlahan angka, dibuat dengan tipe pecahan (0.0).
    var total = 0.0
    
    // Perulangan untuk membaca setiap angka 'value' yang ada di dalam 'values'.
    for (value in values) {
        
        // Menambahkan tiap angka ke dalam variabel 'total'.
        total += value
    }
    
    // Membagi 'total' dengan jumlah angka yang dimasukkan (values.size) untuk menghitung rata-rata.
    total /= values.size
    
    // Mencetak hasil rata-rata ke konsol.
    println("Final Value $name = $total")
}

// Fungsi utama tempat program mulai berjalan.
fun main() {
    
    // Komentar penjelas (diabaikan oleh program).
    // Contoh pemanggilan fungsi dengan beberapa nilai
    
    // Memanggil 'finalValue' dengan nama "Budi" dan 4 data nilai sekaligus (80, 90, 75, 85).
    finalValue("Budi", 80, 90, 75, 85)
}