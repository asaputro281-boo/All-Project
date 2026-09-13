fun main() {
    // Membuat Lambda dengan 'it'.
    // Karena hanya ada 1 parameter, tidak perlu menulis nama parameter, cukup pakai kata kunci 'it'.
    val lambdaName: (String) -> String = {
        it.uppercase() // 'it' otomatis merujuk ke data String yang dimasukkan.
    }

    // Mengeksekusi lambda dengan nilai "Angga", hasilnya ("ANGGA") disimpan ke variabel 'name'.
    val name = lambdaName("Angga")

    // Mencetak isi variabel 'name' ("ANGGA") ke terminal.
    println(name)
}