package belajar.oop.f12_lateinitializedproperties.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Television {
    // 'lateinit' = janji bahwa properti ini akan diisi nanti sebelum dipakai (hanya untuk 'var' dan tipe non-null)
    // Dipakai agar tidak perlu memberi nilai awal atau membuat tipenya nullable
    lateinit var brand: String

    // Function untuk mengisi brand setelah objek dibuat
    fun initTelevision() {
        brand = "Samsung"
    }
}

// (File ini hanya definisi class, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
