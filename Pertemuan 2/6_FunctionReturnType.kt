// Deklarasi function 'sum' dengan dua parameter 'a' dan 'b' bertipe Int (bilangan bulat).
// Keterangan ': Int' di akhir berarti function ini wajib mengembalikan nilai berupa data bertipe Int.
fun sum(a: Int, b: Int): Int {
    
    // Membuat variabel imutabel (konstanta) 'total' untuk menyimpan hasil penjumlahan 'a' ditambah 'b'.
    val total = a + b
    
    // Mengembalikan nilai dari variabel 'total' ke kode yang memanggil function ini menggunakan kata kunci 'return'.
    return total
}

// Function utama ('main') sebagai titik awal jalannya program.
fun main() {
    
    // Memanggil function 'sum' dengan memberikan argumen a = 100 dan b = 100 menggunakan Named Argument.
    // Nilai kembalian dari function 'sum' (yaitu 200) disimpan ke dalam variabel 'result'.
    val result = sum(a = 100, b = 100)
    
    // Mencetak isi variabel 'result' (200) ke konsol.
    println(result)
}