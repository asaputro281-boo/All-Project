// Deklarasi function bernama 'hello' yang memiliki dua parameter: 
// 1. 'firstName' dengan tipe String (wajib diisi saat dipanggil).
// 2. 'lastName' dengan tipe String dan nilai default string kosong "" (opsional/tidak wajib diisi).
fun hello(firstName: String, lastName: String = "") {
    
    // Mencetak teks ke konsol/layar dengan menggabungkan nilai dari variabel 'firstName' dan 'lastName'
    // menggunakan fitur String Template ($).
    println("Hello $firstName $lastName")
}

// Function utama ('main') yang merupakan titik awal (entry point) ketika program Kotlin dijalankan.
fun main() {
    
    // Memanggil function 'hello' dengan hanya memberikan 1 argumen ("Eko") untuk 'firstName'.
    // Karena 'lastName' tidak diisi, maka 'lastName' akan menggunakan nilai default-nya yaitu string kosong "".
    // Output: Hello Eko 
    hello("Angga")
    
    // Memanggil function 'hello' dengan memberikan 2 argumen ("Eko" dan "Khannedy").
    // 'firstName' akan diisi dengan "Eko" dan 'lastName' akan diisi dengan "Khannedy" (menimpa nilai default-nya).
    // Output: Hello Eko Khannedy
    hello("Angga", "Saputro")
}