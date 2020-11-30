import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()

    if (first > 0 && second <= 0 && third <= 0) {
        println("true")
    } else if (second > 0 && first <= 0 && third <= 0) {
        println("true")
    } else if (third > 0 && second <= 0 && first <= 0) {
        println("true")
    } else {
        println("false")
    }
}