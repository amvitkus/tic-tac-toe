import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val numString = scanner.nextLine()
    val firstNum = numString[0].toInt()
    val secondNum = numString[1].toInt()
    val thirdNum = numString[2].toInt()

    val fourthNum = numString[3].toInt()
    val fifthNum = numString[4].toInt()
    val sixthNum = numString[5].toInt()

    if (firstNum + secondNum + thirdNum == fourthNum + fifthNum + sixthNum) {
        println("Lucky")
    } else {
        println("Regular")
    }
}