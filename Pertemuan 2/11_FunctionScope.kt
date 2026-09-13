// Function utama ('main') sebagai titik awal eksekusi program.
fun main() {
    
    // Deklarasi Function Scope (inner function) bernama 'sayHello' di dalam fungsi 'main'.
    // Fungsi ini hanya bisa diakses/dipanggil dari dalam lingkup fungsi 'main'.
    fun sayHello(name: String): Unit {
        
        // Mencetak teks "Hello " diikuti isi variabel 'name' ke layar.
        println("Hello $name")
    }

    // Memanggil fungsi 'sayHello' yang ada di dalam lingkup 'main' menggunakan Named Argument.
    // Output: Hello Angga
    sayHello(name = "Angga")
}