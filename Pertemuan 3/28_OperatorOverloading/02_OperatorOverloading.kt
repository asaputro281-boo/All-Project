package belajar.oop.f28_operatoroverloading.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Fruit(val total: Int) {
    // 'operator fun plus' = mendefinisikan arti tanda '+' untuk Fruit
    // Fruit + Fruit akan menghasilkan Fruit baru dengan total dijumlahkan
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(total + fruit.total)
    }
}

fun main() {
    // Tanda '+' diterjemahkan menjadi Fruit(100).plus(Fruit(100))
    val fruit = Fruit(100) + Fruit(100)

    // Output: Fruit(total=200)
    println(fruit)
}
