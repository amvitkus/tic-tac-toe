import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    val array = Array(n) { scanner.nextInt() }
    val list = array.toList()
    Collections.rotate(list, +1)
    println(list.toIntArray().joinToString(" "))
}