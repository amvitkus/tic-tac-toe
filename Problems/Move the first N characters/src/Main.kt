import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val text = scanner.next()
    val number = scanner.nextInt()
    if (number > text.length) {
        println(text)
    } else {
        val result = text.substringAfter(text.substring(0, number)) + text.substring(0, number)
        println(result)
    }
}