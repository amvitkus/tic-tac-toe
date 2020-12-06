import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {
    // write your code here

    val scanner = Scanner(System.`in`)
    var a = scanner.nextLine()
    var b = scanner.nextLine()
    var c = scanner.nextLine()
    var n = scanner.nextLine()

    a = charArrayOf('A', 'B', 'C', 'D', 'Z').toString()
    b = charArrayOf('a', 'b', 'c', 'd', 'z').toString()


    var uppercase = List(25) { arrayOf(a)}
    var lowercase = List(25) { arrayOf(b)}
    //var digits = List(99) {Random(0, 100)}

    //println("$uppercase$lowercase$digits")
}