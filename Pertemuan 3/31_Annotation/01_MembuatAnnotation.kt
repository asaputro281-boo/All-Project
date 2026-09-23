package belajar.oop.f31_annotation.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// @Target = annotation ini hanya boleh dipasang pada class
@Target(AnnotationTarget.CLASS)
// @Retention(RUNTIME) = informasi annotation tetap ada saat program berjalan (bisa dibaca dengan reflection)
@Retention(AnnotationRetention.RUNTIME)
// @MustBeDocumented = annotation ini ikut masuk ke dokumentasi
@MustBeDocumented
// Deklarasi annotation bernama Fancy, dengan parameter 'author' untuk mencatat pembuatnya
annotation class Fancy(val author: String)

// (File ini hanya definisi annotation, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
