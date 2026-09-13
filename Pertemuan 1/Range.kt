fun main () {
    // ------------------------------------------
    // 8. KATEGORI: TIPE DATA RANGE & OPERASI RANGE
    // ------------------------------------------

    // count() mendapatkan total data dirange 
    // contains mengecek apakah terdapat value tersebut 
    // first mendapatkan nilai pertama 
    // last mendapatkan nilai terakhir 
    // step mendapatkan nilai tiap kenaikan 
    println("=== 8. TIPE DATA RANGE ===")

    val range = 0..1000
    println("Total Data Range: ${range.count()}")
    // ${range.count()} Menghitung jumlah total angka di dalam rentang. Karena dimulai dari 0 sampai 1000, hasilnya adalah 1001 angka.
    println("Contains 500: ${range.contains(500)}")
    // ${range.contains(500)} Mengecek apakah angka 500 ada di dalam rentang tersebut. Hasilnya berupa Boolean (true atau false).
    println("First Value: ${range.first}")
    // ${range.first}  Mengambil angka pertama dalam rentang (yaitu 0).
    println("Last Value: ${range.last}")
    // ${range.last} Mengambil angka terakhir dalam rentang (yaitu 1000).

    // Range Terbalik & Step
    val rangeDownTo = 1000 downTo 0
    // 1000 downTo 0: Membuat deret angka turun (terbalik) dari 1000 sampai 0.
    val range1Step = 0..1000 step 5
    // 0..1000 step 5 Membuat deret angka naik dari 0 sampai 1000, tetapi dengan kelipatan/lompatan 5 ($0, 5, 10, 15,)
    val range2Step = 1000 downTo 0 step 5
    // 1000 downTo 0 step 5 Membuat deret angka turun dari 1000 sampai 0 dengan kelipatan/lompatan 5 ($1000, 995, 990,)
    println("Step Kenaikan range1Step: ${range1Step.step}")
    println()
}