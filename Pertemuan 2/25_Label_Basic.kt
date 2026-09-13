fun main() {
    // Memberikan label 'loopI@' pada perulangan luar (variabel i dari 1 sampai 10).
    loopI@ for (i in 1..10) {
        
        // Memberikan label 'loopJ@' pada perulangan dalam (variabel j dari 1 sampai 10).
        loopJ@ for (j in 1..10) {
            
            // Mencetak perkalian antara 'i' dan 'j' ke terminal (contoh: "1 x 1 = 1").
            println("$i x $j = ${i * j}")
        }
    }
}