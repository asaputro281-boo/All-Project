package belajar.oop.f18_anonymousclass.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

interface Action {
    fun action(): Unit
}

fun fireAction(action: Action) {
    action.action()
}

fun main() {
    // 'object : Action { ... }' = anonymous class, yaitu class tanpa nama yang dibuat di tempat
    // Tidak perlu membuat class baru hanya untuk dipakai sekali
    fireAction(object : Action {
        override fun action() = println("Action One")
    })
    // Output: Action One

    fireAction(object : Action {
        override fun action() = println("Action Two")
    })
    // Output: Action Two
}
