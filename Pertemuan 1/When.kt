fun main () {
    // ------------------------------------------
    // 13. KATEGORI: WHEN EXPRESSION
    // ------------------------------------------
    println("=== 13. WHEN EXPRESSION ===")

    val gradeExam = 'A'

    // When dasar
    // gradeExam digunakan untuk mengecek secara presisi satu per satu 
    /* cara kerjanya jika nilai A jalankan perintah Amazing , jika nantinya tidak ada karakter 
    A sampai E yang cocok maka blok else akan dijalankan*/ 
    when (gradeExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Ups")
    }

    // When Multiple Option
    // kegunaan mengelompkkan beberapa nilai alternatif ke dalam satu cabang aksi 
    /* jadi jika gradeExam bernilai A,B,C maka hasilnya mencetak pass jika tidak A,B,C maka 
    Not Pass */
    when (gradeExam) {
        'A', 'B', 'C' -> println("Pass")
        else -> println("Not Pass")
    }

    // When In Expression
    // kegunaan untuk mengecek apakah suatu nilai ada atau in atau tidak ada (!in) didalam sebuah array
    val passValues = arrayOf('A', 'B', 'C')
    when (gradeExam) {
        in passValues -> println("Pass (in Array)")
        !in passValues -> println("Try Again")
    }

    // When Is Expression
    // kegunaan untuk memeriksa tipe data dari suatu variabel (is atau !is)
    /* cara kerjanya jadi jika tipe data awal bersifat fleksibel atau umum.
    disini program mengecek apakah checkname bertipe string jika benar , maka
    mencetak this is string */
    val checkName: Any = "Angga Dwi Saputro"
    when (checkName) {
        is String -> println("This is String")
        !is String -> println("This is not String")
    }

    val examValue = 80
    // When Tanpa Variable (Pengganti If Else)
    /*kegunaan menggantikan struktur percabangan if els if else agar
    kodenya lebih rapi dan mudah dibaca*/ 
    /*cara kerja kita tidak memasukkan variabel didalam tanda kurung when (...).
    sebagai gantinya , tiap baris langsung diisi oleh ekspresi kondisi logika boolean (>,<,==,dsb)*/
    when {
        examValue > 80 -> println("Good Job (When without Var)")
        examValue > 60 -> println("Not Bad")
        else -> println("Try again next year")
    }
    println()
}