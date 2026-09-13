// Deklarasi function 'printHello' dengan parameter 'name' bertipe Nullable String (String?).
// Keterangan ': Unit' menunjukkan bahwa function ini tidak mengembalikan nilai data apapun (mirip 'void' di bahasa lain).
fun printHello(name: String?): Unit {
    
    // Mengecek kondisi apakah parameter 'name' bernilai null.
    if (name == null) {
        
        // Jika 'name' bernilai null, cetak pesan bawaan "Hello Angga" ke konsol.
        println("Hello Angga")
        
    // Blok alternatif jika 'name' tidak bernilai null (memiliki isi teks).
    } else {
        
        // Cetak teks "Hello " diikuti dengan isi nilai dari variabel 'name' menggunakan String Template ($).
        println("Hello $name")
    }
}

// Function utama ('main') sebagai titik awal eksekusi program.
fun main() {
    
    // Memanggil function 'printHello' dengan memberikan nilai "Angga" pada parameter 'name' menggunakan Named Argument.
    // Karena "Angga" bukan null, maka blok 'else' yang akan dieksekusi.
    // Output: Hello Angga
    printHello(name = "Angga")
}