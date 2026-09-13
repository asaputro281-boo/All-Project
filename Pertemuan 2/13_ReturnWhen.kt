// Function utama ('main') sebagai titik awal jalannya program.
fun main() {

    // Deklarasi fungsi lokal 'sayHello' dengan parameter 'name' yang memiliki nilai default string kosong "".
    // Fungsi ini mengembalikan nilai data bertipe String (: String).
    fun sayHello(name: String = ""): String {
        
        // Mengembalikan nilai secara langsung menggunakan Return When Expression.
        return when (name) {
            
            // Jika isi variabel 'name' adalah string kosong "", kembalikan teks "Hello Bro".
            "" -> "Hello Bro"
            
            // Cabang alternatif (selain string kosong), kembalikan teks "Hello " digabung dengan isi 'name'.
            else -> "Hello $name"
        }
    }

    // Komentar penjelas (diabaikan oleh program).
    // Tambahkan println agar hasil return fungsi dicetak ke terminal
    
    // Memanggil 'sayHello' dengan argumen name = "Angga", lalu mencetak hasil kembaliannya ("Hello Angga") ke terminal.
    println(sayHello(name = "Angga"))
}