fun main () {
    // fun main fungsi utama nya sebuah entry point dalam kotlin , dan semua kode yang ada pada didalam kurung ini kurawal akan dieksekusi


    // Integer Number 
    // var kode singkatan dari variabel yang digunakan untuk tempat data yang nilainya bisa diubah ubah - ubah saat program berjalan 
    // println perintah dasar kotlin yang digunakan untuk menampilkan atau mencetak nilai 
    var age: Byte = 22
    var height: Int = 180
    var distance: Short = 2000
    var balance: Long = 100000000L
    // byte sebuah penyimpanan paling kecil seperti diatas yang digunakan untuk age (umur) 
    // int  untuk penyimpanan ukuran yang standart yang digunakan data height (tinggi badan)
    // short penyimpanan yang lebih besar dari int 
    // sedangkan long penyimpanan besar dan huruf L yang besar digunakan untuk angka yang besar 

    println("Age (Byte): $age")
    println("Height (Int): $height")
    println("Distance (Short): $distance")
    println("Balance (Long): $balance")
    // $ dengan menggunakan tanda tersebut nanti nya akan mencetak isi atau angka didalam variabel  
    // () tempat untuk memberikan atau data yang ingin diproses oleh sebuah fungsi 

    // Floating Point Number
    var value: Float = 98.98F
    var radius: Double = 234234234.54535
    // float digunakn untuk desimal yang butuh hemat memori , yang wajib pakai akhiran f 
    // double adalah tipe desimal standar dikotlin tipe ini sanggung untuk menampung banyak digit dibelakang koma dengan tingkat presisi tinggi 
    println("Value (Float): $value")
    println("Radius (Double): $radius")

    // Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001
    // 0x memberi tahu komputer bahwa ini adalah angka heksadesimal. Nilai FF dalam heksadesimal itu sama dengan 
    // 0b memberi tahu bahwa ini adalah angka biner nilai 0001 dalam biner sama dgn 1 dalam angka desimal biasa
    println("Decimal Literal: $decimalLiteral")
    println("Hexadecimal Literal: $hexadecimalLiteral")
    println("Binary Literal: $binaryLiteral")

    // Underscore in Number
    var ageWithUnderscore: Byte = 2_2
    var heightWithUnderscore: Int = 1_8_0
    var distanceWithUnderscore: Short = 2_000
    var balanceWithUnderscore: Long = 100_000_000L

    println(ageWithUnderscore)
    println(heightWithUnderscore)
    println(distanceWithUnderscore)
    println(balanceWithUnderscore)

    var number: Int = 100
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(number)
    println(byte)
    println(int)
    println(long)
    println(float)
    println(double)
    println()
}