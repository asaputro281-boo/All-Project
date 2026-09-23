package belajar.oop.f27_destructuringdeclarations.p06 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

// Data class untuk data login
data class Login(val user: String, val pass: String)

// Typealias untuk lambda: menerima Login dan mengembalikan Boolean
typealias LoginCallback = (Login) -> Boolean

// Function login: menjalankan callback dengan data login yang diberikan
fun login(login: Login, callback: LoginCallback): Boolean {
    return callback(login)
}

fun main() {
    val request = Login("angga", "secret")

    // 'it' = nama otomatis untuk parameter tunggal lambda (di sini bertipe Login)
    // Hasilnya true jika user dan pass cocok
    val success = login(request) { it.user == "angga" && it.pass == "secret" }

    // Output: true
    println(success)
}
