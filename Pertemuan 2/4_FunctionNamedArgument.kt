// Deklarasi function 'fullName' dengan tiga parameter bertipe String:
// 'firstName', 'middleName', dan 'lastName'.
fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    // Mencetak teks ke layar menggabungkan ketiga nilai variabel 
    // menggunakan String Template ($) sesuai urutan pemanggilan di dalam println.
    println("Hello $firstName $middleName $lastName")
}

// Function utama ('main') sebagai entry point jalannya program.
fun main() {
    // Memanggil function 'fullName' dengan menggunakan fitur Named Argument.
    fullName(
        // Mengisi parameter 'firstName' dengan nilai "Angga".
        firstName = "Angga",
        
        // Mengisi parameter 'lastName' dengan nilai "Saputro" di posisi kedua.
        // Berkat Named Argument, urutan pengisian ini tidak menyebabkan error.
        lastName = "Saputro",
        
        // Mengisi parameter 'middleName' dengan nilai "Dwi" di posisi ketiga.
        middleName = "Dwi"
    )
}