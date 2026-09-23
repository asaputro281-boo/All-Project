package belajar.oop.f04_shape.p04 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Primary constructor punya 3 parameter
open class Shape(val name: String, val shape: Int, val color: String) {
    // Secondary constructor 1: warna diisi string kosong
    constructor(name: String, shape: Int) : this(name, shape, "")

    // Secondary constructor 2: jumlah sisi diisi -1, lalu meneruskan ke constructor di atasnya
    constructor(name: String) : this(name, -1)
}

// (File ini hanya definisi class, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
