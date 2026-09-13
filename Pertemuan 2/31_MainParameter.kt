fun main(args: Array<String>) {
    // Jika args kosong (saat di-run lewat VS Code), kita beri nilai bawaan untuk tes
    val data = if (args.isEmpty()) arrayOf("Angga", "Dwi", "Saputro") else args

    for (value in data) {
        println(value)
    }
}