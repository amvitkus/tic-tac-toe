import java.util.*

fun main() {
    // write your code here
    val number = readLine()!!
    var firstHalf = 0
    var lastHalf = 0
    for (i in 0 until number.length / 2) {
        firstHalf += number[i].toInt()
    }
    for (i in number.length / 2 until number.length) {
        lastHalf += number[i].toInt()
    }
    println(if (firstHalf == lastHalf) "YES" else "NO")
}