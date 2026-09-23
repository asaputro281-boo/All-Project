package belajar.oop.f17_innerclass.p02 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Boss(val name: String) {

    inner class Employee(val name: String) {

        fun hi(){
            println("Hi, I'm $name, and my boss is ${this@Boss.name}")
        }

    }
}

fun main() {
    // Membuat Boss bernama Angga Dwi Saputro
    val angga = Boss("Angga Dwi Saputro")

    // Inner class dibuat lewat objek Boss: angga.Employee(...)
    // Employee ini otomatis terhubung dengan boss 'angga'
    val joko = angga.Employee("Joko")

    // Output: Hi, I'm Joko, and my boss is Angga Dwi Saputro
    joko.hi()

    val budi = angga.Employee("Budi")

    // Output: Hi, I'm Budi, and my boss is Angga Dwi Saputro
    budi.hi()
}
