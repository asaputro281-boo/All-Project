const val APP = "Aplikasi Saya"
const val VERSION = "1.0.0"

fun main () {
    // ------------------------------------------
    // 6. KATEGORI: VARIABLE & NULLABLE
    // ------------------------------------------
    println("=== 6. VARIABLE & NULLABLE ===")

    // Variable Mutable (var)
    // var mutable merupakan nilainya bisa dan boleh berubah di tengah program berjalan.
    var mutableFirstName: String = "Angga"
    var mutableLastName: String = "Saputro"
    mutableLastName = "Dwi Saputro" // Mengubah nilai variabel
    println("Mutable Name: $mutableFirstName $mutableLastName")

    // Variable Immutable (val)
    // var immutable digunakan untuk nilai yang sekali diisi tidak boleh diubah lagi 
    val immutableFirstName: String = "Angga"
    val immutableLastName: String = "Saputro"
    // immutableLastName = "Dwi Saputro" // Error jika diubah
    println("Immutable Name: $immutableFirstName $immutableLastName")

    // Variable Nullable
    // var 
    var nullableFirstName: String? = "Angga"
    nullableFirstName = null
    println("Safe Call Length: ${nullableFirstName?.length}")

    // Variable Constant (Dipanggil dari luar fun main)
    println("Welcome to $APP version $VERSION")
    println()
}