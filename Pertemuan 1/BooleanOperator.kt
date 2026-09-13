fun main () {
    // ------------------------------------------
    // 11. KATEGORI: OPERASI BOOLEAN (LOGIKA)
    // ------------------------------------------
    println("=== 11. OPERASI BOOLEAN ===")

    var finalExam = 80
    var attendant = 75

    // var finalExam menyimpan nilai ujian akhir 
    // var attendant menyimpan nilai atau persentase kehadiran

    var passFinalExam = finalExam > 75
    var passAttendant = attendant > 80

    // finalExam > 75 untuk mengecek apakah nilai ujiannya lebih besar dari 75 (Hasil: true)
    // attendant > 80 untuk mengecek apakah kehadirannya lebih besar dari 80 (Hasil: false)

    // 1. OPERASI DAN (&&)
    var passAnd = passFinalExam && passAttendant
    println("AND (&&) : Lulus Ujian Akhir ($passFinalExam) AND Lulus Kehadiran ($passAttendant) = Hasil: $passAnd")

    // && mensyaratkan semua kondisi harus true agar hasil akhirnya true
    // karena passFinalExam = true dan passAttendant = false, maka passAnd menghasilkan false


    // 2. OPERASI ATAU (||)
    var passOr = passFinalExam || passAttendant
    println("OR  (||) : Lulus Ujian Akhir ($passFinalExam) OR Lulus Kehadiran ($passAttendant)  = Hasil: $passOr")

    // || (OR) bernilai true jika salah satu atau kedua kondisi bernilai true
    // karena passFinalExam = true (meskipun passAttendant = false), maka passOr menghasilkan true


    // 3. OPERASI KEBALIKAN / NOT (!)
    var notPassFinalExam = !passFinalExam
    var notPassAttendant = !passAttendant

    println("NOT (!)  : Kebalikan Lulus Ujian Akhir (!$passFinalExam) = Hasil: $notPassFinalExam")
    println("NOT (!)  : Kebalikan Lulus Kehadiran (!$passAttendant) = Hasil: $notPassAttendant")

    // ! (NOT) berfungsi membalikkan nilai boolean
    // passFinalExam nilainya true, maka !passFinalExam menghasilkan false
    // passAttendant nilainya false, maka !passAttendant menghasilkan true
}