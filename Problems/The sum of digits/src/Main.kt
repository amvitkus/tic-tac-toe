import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()
    val result = num / 100 + num % 100 / 10 + num % 10
    println(result)
}