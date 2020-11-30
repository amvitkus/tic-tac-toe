import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    val array = Array(n) { scanner.nextInt() }
    val shift = scanner.nextInt()
    val rotatedArray = IntArray(n)

    for (i in 0..array.lastIndex) {
        val j = (shift + i) % n
        rotatedArray[j] = array[i]
    }

    println(rotatedArray.joinToString(" "))
}