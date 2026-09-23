package belajar.oop.f08_equals.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Company(val name: String) {
    // hashCode() dihitung dari isi 'name', sehingga isi yang sama menghasilkan hash yang sama
    override fun hashCode(): Int {
        return name.hashCode()
    }

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

    // Output: true
    println(company1 == company2) // true

    // Output: true
    println(company1.hashCode() == company2.hashCode()) // true
}
