package belajar.oop.f20_singletonobject.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// 'object' membuat class sekaligus satu-satunya objeknya (singleton)
object Utilities {
    val name = "Utilities"

    // Function untuk mengubah teks menjadi huruf kapital
    fun toUpper(value: String): String {
        return value.uppercase()
    }
}

// (File ini hanya definisi object, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
