fun main () {
    // ------------------------------------------
    // 9. KATEGORI: OPERASI MATEMATIKA & OPERATOR
    // ------------------------------------------
    println("=== 9. OPERASI MATEMATIKA ===")

    var result1: Int = 10 / 3
    println("Hasil 10 / 3 = $result1")
    // var result1: Int = .../... Dipakai kalau kamu cuma butuh hasil bagi angka utuh
    // dan karena tipe datanya int angka bulat tanpa koma , kotlin mengambil hasil bulatnya saja yaitu 3
    var result2: Int = 10 + 10 / 2
    println("Hasil 10 + 10 / 2 = $result2")
    // var result2: Int =...  +...  /... dalam matematika pembagian didahulukan dari pada penjumlahan

    // Augmented Assignments & Unary Operator
    var a = 10
    a += 10 // a = a + 10
    // a nilainya adalah 10 maka tinggal dijumlahkan saja dan nilai a adalah 20 
    println("Augmented Assignment (10 += 10): $a")

    a++ // Unary Operator Increment
    // a++ merupakan jalan pintas untuk menambahkan 1 
    println("Unary Operator (a++): $a")
    println()
}