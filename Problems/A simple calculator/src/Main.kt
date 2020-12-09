import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextLong()
    val op = scanner.next()
    val b = scanner.nextLong()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> if (b > 0 || b < 0) {
            println(a / b)
        } else {
            println("Division by 0!")
        }
        else -> println("Unknown operator")
    }
}