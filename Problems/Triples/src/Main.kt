import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val size = scanner.nextInt()
    val numArray = Array(size) { scanner.nextInt() }
    var m = 0

    for (i in 0..numArray.lastIndex - 2) {
        if (numArray[i] == numArray[i + 1] - 1 && numArray[i + 1] == numArray[i + 2] - 1) {
            m++
        }
    }

    println(m)
}