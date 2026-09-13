fun main (){
    // ------------------------------------------
    // 15. KATEGORI: WHILE LOOPS
    // ------------------------------------------
    println("=== 15. WHILE LOOPS ===")


    /* Melakukan perulangan dengan mengecek syarat/kondisi di awal. Jika kondisi sejak awal sudah bernilai false,
     maka isi di dalam loop tidak akan pernah dijalankan sama sekali.
     */
    /* cara kerjanya atau alurnya Variabel iWhile dimulai dari 0. 
    Sebelum mencetak teks, program mengecek apakah iWhile < 3. Jika ya, kode mencetak angka lalu menambahkan iWhile sebesar 1. */
    var iWhile = 0
    while (iWhile < 3) {
        println("While Loop ke-$iWhile")
        iWhile++
    }
    println()
}