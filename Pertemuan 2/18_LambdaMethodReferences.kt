// Fungsi biasa 'toUpper' yang menerima String dan mengembalikan String huruf kapital.
fun toUpper(value: String): String = value.uppercase()

fun main() {
    // Membuat lambda menggunakan Function Reference (::).
    // Tanda '::' mengambil fungsi 'toUpper' yang sudah ada lalu mengonversinya menjadi lambda.
    val lambdaName: (String) -> String = ::toUpper

    // Mengeksekusi lambda dengan nilai "Angga", hasilnya ("ANGGA") disimpan ke variabel 'name'.
    val name = lambdaName("Angga")

    // Mencetak isi variabel 'name' ("ANGGA") ke terminal.
    println(name)
}