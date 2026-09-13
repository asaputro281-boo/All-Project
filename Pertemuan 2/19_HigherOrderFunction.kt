// High-Order Function 'hello' yang menerima parameter fungsi lain ('transformer').
fun hello(value: String, transformer: (String) -> String): String {
    // Mengembalikan teks "Hello " digabung dengan hasil olahan fungsi 'transformer'.
    return "Hello ${transformer(value)}"
}

fun main() {
    // Lambda untuk mengubah teks ke huruf kapital.
    val upperTransformer = { value: String -> value.uppercase() }
    
    // Lambda untuk mengubah teks ke huruf kecil.
    val lowerTransformer = { value: String -> value.lowercase() }
    
    // Memanggil 'hello' dengan memasukkan variabel lambda sebagai argumen.
    println(hello(value = "Angga", upperTransformer)) // Output: Hello EKO
    println(hello(value = "Angga", lowerTransformer)) // Output: Hello eko

    // Trailing Lambda: Karena lambda berada di posisi parameter terakhir,
    // blok lambda-nya bisa dikeluarkan dari tanda kurung ().
    val result1 = hello(value = "Angga") { value: String ->
        value.uppercase()
    }
    println(result1) // Output: Hello EKO

    // Trailing Lambda untuk mengubah ke huruf kecil.
    val result2 = hello(value = "Angga") { value: String ->
        value.lowercase()
    }
    println(result2) // Output: Hello eko
}