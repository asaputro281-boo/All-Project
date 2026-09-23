package belajar.oop.f11_gettersetter.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Note(title: String) {
    var title: String = title
        // GETTER: dijalankan saat properti dibaca. 'field' = nilai asli (backing field) properti ini
        get() = field
        // SETTER: dijalankan saat properti diisi. 'value' = nilai baru yang ingin dimasukkan
        set(value) {
            // Validasi: nilai baru hanya disimpan jika tidak kosong atau bukan spasi saja
            if (value.isNotBlank()) {
                field = value
            }
        }
}

// (File ini hanya definisi class, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
