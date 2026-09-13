// Deklarasi Single Expression Function 'double' dengan parameter 'a' bertipe Int.
// Menggunakan tanda sama dengan '=' untuk langsung mengembalikan hasil perkalian 'a * 2' bertipe Int tanpa perlu blok kurung kurawal '{}' atau kata kunci 'return'.
fun double(a: Int): Int = a * 2

// Deklarasi Single Expression Function 'hi' dengan parameter 'name' bertipe String.
// Fungsi ini menjalankan perintah 'println' dan secara otomatis mengembalikan tipe 'Unit' (tidak mengembalikan nilai data).
fun hi(name: String): Unit = println("Hi $name")

// Function utama ('main') sebagai entry point program.
fun main() {
    
    // Memanggil function 'double' dengan argumen a = 10 menggunakan Named Argument[cite: 1].
    // Hasil pengembalian (10 * 2 = 20) disimpan ke dalam variabel 'result'.
    val result = double(a = 10)
    
    // Memanggil function 'hi' dengan argumen name = "Angga" menggunakan Named Argument[cite: 1].
    // Menghasilkan cetakan teks ke konsol: Hi Angga
    hi(name = "Angga")
}