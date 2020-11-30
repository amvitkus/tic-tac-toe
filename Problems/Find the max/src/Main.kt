import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var max = Integer.MIN_VALUE
    var maxIndex = 0
    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    for (i in array.indices) {
        if (array[i] > max) {
            max = array[i]
            maxIndex = i
        }
    }
    print(maxIndex)
}