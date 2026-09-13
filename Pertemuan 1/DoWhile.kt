fun main () {
    // ------------------------------------------
    // 16. KATEGORI: DO WHILE LOOPS
    // ------------------------------------------
    println("=== 16. DO WHILE LOOPS ===")


    /*kegunaan nya untuk Melakukan perulangan dengan mengecek syarat/kondisi di akhir. 
    Ini menjamin blok kode di dalam do pasti dijalankan minimal 1 kali, meskipun kondisinya bernilai false sejak awal. */
    /* untuk carakerjanya atau alurnya Variabel iDoWhile dimulai dari 0. 
    Program langsung mencetak teks dan menambah nilai iDoWhile, baru setelah itu mengecek syarat while (iDoWhile < 3). */
    var iDoWhile = 0
    do {
        println("Do While Loop ke-$iDoWhile")
        iDoWhile++
    } while (iDoWhile < 3)
    println()
}