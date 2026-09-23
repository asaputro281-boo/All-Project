package belajar.oop.f16_sealed.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// 'sealed' = hanya class di dalam package/modul yang sama yang boleh mewarisi
// Berguna agar daftar turunannya lengkap dan terkontrol
sealed class Operation(val name: String)

// Dua turunan Operation
class Plus : Operation("Add")
class Minus : Operation("Minus")

// (File ini hanya definisi class, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
