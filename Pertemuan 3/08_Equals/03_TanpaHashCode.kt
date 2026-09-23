package belajar.oop.f08_equals.p03 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Company(val name: String) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> name == other.name
            else -> false
        }
    }
}

fun main() {
    val company1 = Company("Angga Dwi Saputro")
    val company2 = Company("Angga Dwi Saputro")

    // hashCode() belum di-override, jadi nilainya berasal dari alamat memori dan berbeda
    // Ini tidak baik: objek yang equals() seharusnya punya hashCode() yang sama
    // Output: false
    println(company1.hashCode() == company2.hashCode()) // false
}
