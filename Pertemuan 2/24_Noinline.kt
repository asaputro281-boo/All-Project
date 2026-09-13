// Declaring Inline Function 'hello' dengan dua parameter lambda.
// 'firstName' di-inline, sedangkan 'lastName' ditandai dengan 'noinline'.
inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    // Mengembalikan teks "Hello " digabung hasil eksekusi kedua lambda.
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    // Memanggil 'hello' dengan memberikan dua lambda berturut-turut.
    // Mencetak "Hello Angga Dwi" ke terminal.
    println(hello({ "Angga" }, { "Dwi" }))
}