package belajar.oop.f19_enum.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Setiap nilai enum membawa data 'description' lewat constructor
enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");    // titik koma wajib jika setelah daftar nilai masih ada function/properti lain

    // Function milik enum
    fun printDescription() {
        println(description)
    }
}

fun main() {
    // Output: Male
    Gender.MALE.printDescription()

    // Output: Female
    Gender.FEMALE.printDescription()
}
