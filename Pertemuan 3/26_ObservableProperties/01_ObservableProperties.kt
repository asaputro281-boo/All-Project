package belajar.oop.f26_observableproperties.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Mengimpor Delegates dari library standar Kotlin agar bisa memakai Delegates.observable
import kotlin.properties.Delegates

class ObservableProperties(name: String) {
    // Delegates.observable(nilaiAwal) { ... } = blok dijalankan tiap kali 'name' diubah
    // Parameter blok: property (info properti), oldValue (nilai lama), newValue (nilai baru)
    var name: String by Delegates.observable(name) { property, oldValue, newValue ->
        println("$property changed from $oldValue to $newValue")
    }
}

fun main() {
    // Nilai awal properti name adalah "Angga Dwi Saputro" (tidak memicu observer karena bukan perubahan)
    val observableProperties = ObservableProperties("Angga Dwi Saputro")

    // Mengubah nilai -> observer berjalan
    // Output: var belajar.oop.f26_observableproperties.p01.ObservableProperties.name: kotlin.String changed from Angga Dwi Saputro to Joko
    // (bagian "var belajar....name: kotlin.String" adalah info properti; format teksnya bisa sedikit beda tergantung versi Kotlin)
    observableProperties.name = "Joko"

    // Output: var belajar.oop.f26_observableproperties.p01.ObservableProperties.name: kotlin.String changed from Joko to Budi
    observableProperties.name = "Budi"
}
