fun hello(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}

fun main() {
    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }
        return value.uppercase()
    }

    val result1 = hello(value = "Angga", anonymousUpper)
    println(result1)
}