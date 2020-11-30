import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val size = scanner.nextInt()
    val array = IntArray(size)
    for (i in 0 until size) {
        array[i] = scanner.nextInt()
    }

    val m = scanner.nextInt()
    var output = "NO"

    for (i in 0..array.lastIndex) {
        if (m == array[i]) {
            output = "YES"
            break
        }
    }
    print(output)

}