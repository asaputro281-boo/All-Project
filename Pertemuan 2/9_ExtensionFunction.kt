// Deklarasi Extension Function 'hello' untuk tipe String yang mengembalikan String (: String).
fun String.hello(): String {
    
    // Mengembalikan teks "Hello " digabung dengan nilai objek String pemanggilnya ('this').
    return "Hello $this"
}

// Fungsi utama tempat program mulai berjalan.
fun main() {
    
    // Membuat variabel 'name' bertipe String dengan isi "Angga".
    val name: String = "Angga"
    
    // Memanggil Extension Function '.hello()' dari variabel 'name' dan menyimpan hasilnya ke 'hello'.
    val hello: String = name.hello()
    
    // Komentar penjelas (diabaikan oleh program).
    // Tambahkan println di sini untuk menampilkan output
    
    // Mencetak hasil ("Hello Angga") yang tersimpan dalam variabel 'hello' ke layar.
    println(hello)
}