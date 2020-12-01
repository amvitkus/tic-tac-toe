import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val ticketArray  = IntArray(scanner.nextInt())
    val half1 = ticketArray[0] + ticketArray[1] + ticketArray[2]
    val half2 = ticketArray[3] + ticketArray[4] + ticketArray[5]

    println(half1)
    println(half2)

    if (half1 == half2) {
        println("Lucky")
    } else {
        println("Regular")
    }

    //println(ticketArray.toString())
}