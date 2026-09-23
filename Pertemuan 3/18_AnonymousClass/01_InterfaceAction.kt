package belajar.oop.f18_anonymousclass.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Interface dengan satu function abstract
interface Action {
    fun action(): Unit
}

// Function yang menerima objek Action lalu menjalankan action()-nya
fun fireAction(action: Action) {
    action.action()
}

// (File ini hanya definisi, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
