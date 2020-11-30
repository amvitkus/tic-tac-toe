import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numArray = IntArray(scanner.nextInt())
    for (i in numArray.indices) {
        numArray[i] = scanner.nextInt()
    }

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()

    var result = "NO"
    for (i in 0 until numArray.lastIndex) {
        if (numArray[i] == num1 && numArray[i + 1] == num2 || numArray[i] == num2 && numArray[i + 1] == num1) {
            result = "YES"
        }
    }

    print(result)
}