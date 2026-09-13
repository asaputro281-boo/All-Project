fun main () {
    // ------------------------------------------
    // 12. KATEGORI: IF EXPRESSION
    // ------------------------------------------
    println("=== 12. IF EXPRESSION ===")

    val examValue = 90

    // If, Else If, Else
    // blok if ini dieksekusi jika kondisi pertama terpenuhi 
    // else if bagian ini akan mengeksekusi jika kondisi pertama tidak terpenuhi apakah nilai ujiannya lebih besar dari 60 
    // else ini merupakan eksekusi jika semua kondisi sebelum sebelumnya tidak terpenuhi , blok ini dieksekusi sebagai pilihan terakhir 
    if (examValue > 80) {
        println("Good Job")
    } else if (examValue > 60) {
        println("Not Bad")
    } else {
        println("Try again next year")
    }


    val examValue1 = 70 
    if (examValue1 > 80) {
        println("Good Job")
    } else if (examValue1 > 60) {
        println("Not Bad")
    } else {
        println("Try again next year")
    }

    val examValue2 = 0 
    if (examValue2 > 80) {
        println("Good Job")
    } else if (examValue2 > 60) {
        println("Not Bad")
    } else {
        println("Try again next year")
    }
    println()
}