import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val pdensity = scanner.nextDouble()
    val height = scanner.nextDouble()
    val gravity = 9.8
    val result = pdensity * gravity * height

    println(result)
}