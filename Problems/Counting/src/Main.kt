import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val size = scanner.nextInt()
    val numbersArray = IntArray(size)
    for (i in 0..numbersArray.lastIndex) {
        numbersArray[i] = scanner.nextInt()
    }

    val m = scanner.nextInt()
    var count = 0

    for (i in 0..numbersArray.lastIndex) {
        if (m == numbersArray[i]) {
            count++
        }
    }

    print(count)
}