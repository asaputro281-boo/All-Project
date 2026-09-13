fun hello(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}

fun main() {
    val result1 = hello(value = "Angga", fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }
        return value.uppercase()
    })
    
    println(result1)
}