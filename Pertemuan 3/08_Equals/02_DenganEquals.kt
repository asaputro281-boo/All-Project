package belajar.oop.f08_equals.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Company(val name: String) {
    // Menimpa equals(): dua Company dianggap sama jika 'name'-nya sama
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> name == other.name   // jika sesama Company, bandingkan isi name
            else -> false                      // jika bukan Company, pasti tidak sama
        }
    }
}

fun main() {
    val company1 = Company("Angga Dwi Saputro")
    val company2 = Company("Angga Dwi Saputro")

    // Output: true   (isi name sama)
    println(company1 == company2) // true
}
