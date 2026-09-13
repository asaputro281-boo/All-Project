// Function utama ('main') sebagai titik awal jalannya program.
fun main() {

    // Deklarasi fungsi lokal 'sayHello' dengan parameter 'name' yang bernilai default string kosong "".
    // Fungsi ini mengembalikan nilai data bertipe String (: String)[cite: 1].
    fun sayHello(name: String = ""): String {
        
        // Mengembalikan nilai secara langsung menggunakan Return If Expression[cite: 1].
        return if (name == "") {
            
            // Mengembalikan teks "Hello Angga" jika 'name' adalah string kosong.
            "Hello Angga"
            
        // Blok alternatif jika 'name' berisi nilai (tidak kosong).
        } else {
            
            // Mengembalikan teks "Hello " digabung dengan isi variabel 'name' ($name).
            "Hello $name"
        }
    }

    // Komentar penjelas (diabaikan saat program dijalankan).
    // Menggunakan println() agar teks muncul di terminal
    
    // Memanggil 'sayHello' dengan argumen name = "Angga", lalu mencetak hasil kembaliannya ("Hello Angga") ke terminal.
    println(sayHello(name = "Angga"))
}