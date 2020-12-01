import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val input: String = scanner.nextLine()

    // use function to check user input
    if (isPalindromeString(input)) {
        println("yes")
    } else {
        println("no")
    }
}

// function to check string is palindrome or not
fun isPalindromeString(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)
    // reverse the string
    val reverseStr = sb.reverse().toString()
    // compare reversed string with input string
    return inputStr.equals(reverseStr, ignoreCase = true)
}