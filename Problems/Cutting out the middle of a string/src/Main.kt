import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()
    if (line.length % 2 != 0) {
        val half = line.length / 2
        print(line.substring(0, half))
        print(line.substring(half + 1))
    } else {
        print(line.substring(0, line.length / 2 - 1))
        print(line.substring(line.length / 2 + 1))
    }
}