package belajar.oop.f17_innerclass.p01 // Nama paket (namespace) file ini; dibuat berbeda-beda supaya tidak bentrok antar file

class Boss(val name: String) {

    // 'inner' = class ini bisa mengakses properti milik class luar (Boss)
    inner class Employee(val name: String) {

        fun hi(){
            // ${name}        = name milik Employee
            // ${this@Boss.name} = name milik Boss (class luar), diakses dengan label this@Boss
            println("Hi, I'm $name, and my boss is ${this@Boss.name}")
        }

    }
}

// (File ini hanya definisi class, tidak ada main. Lihat file berikutnya untuk pemakaiannya)
