fun main() {
    // Membuat Lambda: variabel 'lambdaName' menampung fungsi tanpa nama.
    // Tipe fungsinya '(String) -> String' (menerima String, mengembalikan String).
    val lambdaName: (String) -> String = { value: String ->
        value.uppercase() // Mengubah teks 'value' menjadi huruf kapital.
    }

    // Mengeksekusi lambda dengan memberi argumen "Angga", hasilnya ("ANGGA") disimpan ke variabel 'name'.
    val name = lambdaName("Angga")

    // Mencetak isi variabel 'name' ("ANGGA") ke terminal.
    println(name)
}