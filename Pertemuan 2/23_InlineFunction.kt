// Declaring Inline Function 'hello' yang menerima parameter berupa lambda 'name'.
inline fun hello(name: () -> String): String {
    // Mengembalikan teks "Hello " digabung hasil eksekusi lambda 'name()'.
    return "Hello ${name()}"
}

fun main() {
    // Memanggil 'hello' dengan Trailing Lambda yang mengembalikan String "Angga".
    // Mencetak "Hello Angga" ke terminal.
    println(hello { "Angga" })

    // Memanggil 'hello' dengan Trailing Lambda yang mengembalikan String "Dwi".
    // Mencetak "Hello Dwi" ke terminal.
    println(hello { "Dwi" })
}