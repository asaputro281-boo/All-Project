// High-Order Function 'test' yang menerima String dan sebuah lambda 'param', lalu mengeksekusi 'param(name)'.
fun test(name: String, param: (String) -> Unit): Unit = param(name)

fun main() {
    // Memanggil 'test' menggunakan Trailing Lambda yang diberi label khusus 'testLabel@'.
    test(name = "angga") testLabel@{ it: String ->
        
        // Mengecek apakah parameter lambda ('it') bernilai "angga".
        if (it == "angga") {
            
            // Menghentikan eksekusi lambda dan keluar dari lambda 'testLabel@' secara spesifik.
            return@testLabel
        }
    }
    
    // Tetap dieksekusi dan mencetak "Angga" ke terminal karena return hanya menghentikan lambda.
    println("Angga")
}