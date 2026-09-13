fun sayHello(firstName: String, lastName: String) {  /* mendeklarisakan fungsi sayhello yang menerima dua buah parameter 
    firstname dan lastname */
    println("Hello $firstName $lastName")  /* println("Hello $firstName $lastName") untuk mencetak nilai variabel atau parameter 
    langsung ke dalam teks tanpa perlu menggabungkan secara manual pakai tanda tambah */
}

fun main() { /*fun main untuk menjadi gerbang eksekusi program */
    sayHello("Angga", "Saputro") /*memicu fungsi sayhello println di dalamnya menggunakan data nama tersebut */
}
