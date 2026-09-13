fun main() {
    // Memberikan label 'loopI@' pada perulangan luar.
    loopI@ for (i in 1..10) {
        
        // Memberikan label 'loopJ@' pada perulangan dalam.
        loopJ@ for (j in 1..10) {
            
            // Mencetak hasil perkalian 'i' dan 'j' ke terminal.
            println("$i x $j = ${i * j}")
            
            // Mengecek apakah nilai 'j' sudah mencapai 10.
            if (j == 10) {
                
                // Menghentikan secara paksa perulangan luar yang berlabel 'loopI@'.
                break@loopI
            }
        }
    }
}