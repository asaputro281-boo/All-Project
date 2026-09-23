package belajar.oop.f19_enum.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

enum class Gender {
    MALE, FEMALE
}

fun main() {
    // Mengambil nilai enum dengan format NamaEnum.NILAI
    val man = Gender.MALE
    val woman = Gender.MALE // (di slide tertulis MALE; kemungkinan maksudnya FEMALE)

    // values() mengembalikan array berisi semua nilai enum
    val all: Array<Gender> = Gender.values()

    // Output: MALE
    println(man)

    // Output: MALE   (karena di atas diisi MALE, bukan FEMALE)
    println(woman)

    // joinToString() menggabungkan isi array menjadi satu teks, dipisah koma
    // Output: MALE, FEMALE
    println(all.joinToString())
}
