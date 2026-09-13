fun main() {
    // Membuat variabel 'counter' dengan nilai awal 0 yang bisa diubah (var).
    var counter: Int = 0
    
    // Membuat lambda tanpa parameter 'lambdaIncrement' yang tidak mengembalikan nilai (: () -> Unit).
    val lambdaIncrement: () -> Unit = {
        println("Increment") // Mencetak teks "Increment" ke terminal.
        counter++           // Menambah nilai 'counter' sebanyak 1 (Closure).
    }

    lambdaIncrement() // Eksekusi pertama: mencetak "Increment", counter jadi 1.
    lambdaIncrement() // Eksekusi kedua: mencetak "Increment", counter jadi 2.
    
    println(counter)  // Mencetak nilai akhir 'counter' (2) ke terminal.
}