package belajar.oop.f27_destructuringdeclarations.p07 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

data class Login(val user: String, val pass: String)
typealias LoginCallback = (Login) -> Boolean

fun login(login: Login, callback: LoginCallback): Boolean {
    return callback(login)
}

fun main() {

    val request = Login("angga", "secret")

    // Parameter lambda langsung dipecah menjadi (user, pass), jadi tidak perlu menulis it.user / it.pass
    val success = login(request) { (user, pass) ->
        user == "angga" && pass == "secret"
    }

    // Output: true
    println(success)
}
