fun main () {
    // ------------------------------------------
    // 10. KATEGORI: OPERASI PERBANDINGAN
    // ------------------------------------------
    println("=== 10. OPERASI PERBANDINGAN ===")

    val compA = 100
    val compB = 200
    val compResult: Boolean = compA > compB
    println("Apakah $compA > $compB? Hasil: $compResult")
    // > untuk perbadingan nilai yang lebih dari 

    val compResult2 : Boolean = compA < compB
    println("Apakah $compA < $compB? Hasil : $compResult2")
    // < untuk perbandingan nilai yang kecil dari 

    val compResult3 : Boolean = compA >= compB 
    println("Apakah $compA >= $compB? Hasil : $compResult3")
    // >= untuk perbadingan nilai lebih dari sama dengan 

    val compResult4 : Boolean = compA <= compB
    println("Apakah $compA <= $compB? Hasil: $compResult4")
    // <= untuk perbandingan nilai kurang dari sama dengan 

    val compResult5: Boolean = compA == compB
    println("Apakah $compA == $compB? Hasil: $compResult5")
    // == untuk perbandingan nilai sama dengan 

    val compResult6 : Boolean = compA != compB
    println("Apakah $compA != $compB? Hasil : $compResult6")
    // != untuk perbandingan nilai tidak sama dengan 

    println()
}