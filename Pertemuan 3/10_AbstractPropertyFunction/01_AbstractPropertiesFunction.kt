package belajar.oop.f10_abstractpropertyfunction.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

abstract class Animal {
    // Abstract property: tidak punya nilai, class turunan wajib mengisinya
    abstract val name: String

    // Abstract function: tidak punya isi (tanpa kurung kurawal), class turunan wajib membuat isinya
    abstract fun run(): Unit
}

// (File ini hanya definisi class, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
