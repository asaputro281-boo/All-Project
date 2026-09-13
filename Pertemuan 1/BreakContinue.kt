fun main () {
    // ------------------------------------------
    // 17. KATEGORI: BREAK & CONTINUE
    // ------------------------------------------
    println("=== 17. BREAK & CONTINUE ===")

    // Contoh Break
     /*break digunakan untuk menghentikan seluruh proses perulanngan secara paksa dan langsung 
     keluar dari blok while tanpa break program akan berjalan selamanya tanpa berhenti*/
    println("Penerapan Break:")
    var iBreak = 0
    while (true) {
        println("Break Me ke-$iBreak")
        iBreak++
        if (iBreak > 2) {
            break
        }
    }

    // Contoh Continue
    /* contiune melopati atau menskip sisa kode pada iterasi saat ini tanpa menghentikan perulangan. hasilnya
    , hanya angka angka ganjil saja yang berhasil dicetak ke layar  */
    println("\nPenerapan Continue (Cetak Angka Ganjil 1..500):")
    for (iCont in 1..500) {
        if (iCont % 2 == 0) {
            continue
        }
        println(iCont)
    }
}
