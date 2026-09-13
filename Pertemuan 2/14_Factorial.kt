// Komentar penjelas untuk fungsi perulangan biasa.
// Factorial menggunakan for loop

// Deklarasi fungsi 'factorialLoop' yang menerima parameter 'value' bertipe Int dan mengembalikan nilai Int (: Int).
fun factorialLoop(value: Int): Int {
    
    // Inisialisasi variabel 'result' dengan nilai awal 1 untuk menampung hasil perkalian.
    var result = 1
    
    // Perulangan 'for' dari angka 'value' turun sampai angka 1 (downTo 1).
    for (i in value downTo 1) {
        
        // Mengalikan nilai 'result' saat ini dengan nilai 'i' pada setiap iterasi.
        result *= i
    }
    
    // Mengembalikan nilai akhir dari 'result' setelah perulangan selesai.
    return result
}

// Komentar penjelas untuk fungsi rekursif.
// Factorial menggunakan recursive function

// Deklarasi fungsi 'factorialRecursive' yang menerima parameter 'value' bertipe Int dan mengembalikan Int (: Int).
fun factorialRecursive(value: Int): Int {
    
    // Mengembalikan nilai menggunakan Return When Expression berdasarkan nilai 'value'.
    return when (value) {
        
        // Kondisi henti (base case): jika 'value' bernilai 1, kembalikan angka 1.
        1 -> 1
        
        // Kondisi rekursif: kalikan 'value' dengan pemanggilan kembali fungsi itu sendiri tetapi nilainya dikurangi 1[cite: 1].
        else -> value * factorialRecursive(value = value - 1)
    }
}

// Fungsi utama tempat program mulai dijalankan.
fun main() {
    
    // Komentar penjelas untuk pemanggilan fungsi pertama.
    // Memanggil dan menampilkan hasil factorialLoop
    
    // Memanggil 'factorialLoop(5)' (menghitung 5x4x3x2x1 = 120) lalu mencetaknya ke konsol.
    println("Hasil Factorial Loop: ${factorialLoop(5)}")

    // Komentar penjelas untuk pemanggilan fungsi kedua.
    // Memanggil dan menampilkan hasil factorialRecursive
    
    // Memanggil 'factorialRecursive(5)' lalu mencetaknya ke konsol.
    println("Hasil Factorial Recursive: ${factorialRecursive(5)}")
}