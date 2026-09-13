fun main () {
    // ------------------------------------------
    // 14. KATEGORI: FOR LOOPS
    // ------------------------------------------
    println("=== 14. FOR LOOPS ===")
    // for array untuk menampilkan atau memproses seluruh isi elemen yang ada didalam sebuah array satu per satu secara otomatis
    /*var name yg pertama angga mencetaknya kemudian kedua dwi mencetaknya lalu yang ketiga saputro mencetaknya  */
    val namesArray = arrayOf("Angga", "Dwi", "Saputro")
    println("Iterasi Loop Array:")
    for (name in namesArray) {
        println(name)
    }

    // for range untuk melakukan perulangan berdasarkan urutan angka atau jangkauan tertentu tanpa membuat array manual
    /*cara kerjanya sintaks 0..5 yang artinya nanti akan mencetak 0 sampai 5 secara berurutan */
    println("\nIterasi Loop Range (0..100):")
    for (valRange in 0..100) {
        println(valRange)
    }
    println()
}