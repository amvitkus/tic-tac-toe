import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val line = scanner.nextLine()
    var result = ""
    val lineArray = line.split(" ")

    for (word in lineArray) {
        if (word.length > result.length) {
            result = word
        }
    }
    println(result)
}
