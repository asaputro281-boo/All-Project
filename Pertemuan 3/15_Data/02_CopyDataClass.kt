package belajar.oop.f15_data.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Product(val name: String,
                   val price: Int,
                   val category: String)

fun main() {
    val product = Product("Indomie", 5_000, "Food")

    // copy() tanpa parameter = membuat salinan persis sama
    val product2 = product.copy()

    // copy(price = 10_000) = salinan dengan price diganti, data lainnya tetap sama
    val product3 = product.copy(price = 10_000)

    // Output: Product(name=Indomie, price=5000, category=Food)
    println(product)

    // Output: Product(name=Indomie, price=5000, category=Food)
    println(product2)

    // Output: Product(name=Indomie, price=10000, category=Food)
    println(product3)
}
