package belajar.oop.f15_data.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Kata kunci 'data' membuat Kotlin membuatkan function-function bawaan secara otomatis
data class Product(val name: String,
                   val price: Int,
                   val category: String)

fun main() {
    // Angka 5_000 sama dengan 5000 (underscore hanya untuk memudahkan membaca angka)
    val product = Product("Indomie", 5_000, "Food")

    // toString() otomatis menampilkan seluruh isi data class
    // Output: Product(name=Indomie, price=5000, category=Food)
    println(product) // Product(name=Indomie, price=5000, category=Food)
}
