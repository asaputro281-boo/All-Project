fun main () {
    // ------------------------------------------
    // 5. KATEGORI: TIPE DATA STRING
    // ------------------------------------------
    println("=== 5. TIPE DATA STRING ===")

    // String merupakan tipe data yang berisikan data kumpulan karakter atau sederhannya adalah teks 
    var firstName: String = "Angga"
    var lastName: String = "Saputro"
    var fullName: String = "Angga Dwi Saputro"

    // """...""".trimIndent() kegunaan membuat teks yang terdiri dari beberapa baris sekaligus (menggunakan petik tiga)
    // fungsi .trimIndent sendiri disini berguna untuk menghapus spasi indentitas atau tab bawaaan disebelah kiri agar baris teks rata kiri secara otomatis
    var address: String = """
        Street Not Yet Done,
        Province Jawa Timur,
        Country Indonesia
    """.trimIndent()

    println("First Name: $firstName")
    println("Last Name: $lastName")
    println("Full Name: $fullName")
    println("Address:\n$address")

    // String Trim Margin
    // trimMargin() dan trimMargin(">") untuk menghapus batas margin kiri teks menggunakan karakter penanda (delimiter)
    var address1: String = """
        |Street Not Yet Done,
        |Province Jawa Timur 
    """.trimMargin()

    var address2: String = """
        >Street Not Yet Done,
        >Province Jawa Timur
    """.trimMargin(">")

    println("Address 1 (trimMargin '|'):\n$address1")
    println("Address 2 (trimMargin '>'):\n$address2")

    // Menggabungkan String (Operator +)
    // firstName + " " + lastName kegunaan menyambungkan dua variabel string atau lebih menggunakan operator + 
    var concatenatedName: String = firstName + " " + lastName
    println("Penggabungkan String: $concatenatedName")

    // String Template
    // kode $fullName dan ${fullName.length} Memasukkan isi variabel atau hasil ekspresi kode langsung ke dalam String tanpa menggunakan operator +
    var desc: String = "total $fullName char = ${fullName.length}"
    println("String Template Desc: $desc")
    println()
}