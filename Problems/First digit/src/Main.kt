import java.util.*

fun main() {
    // put your code here
    val word = readLine()!!
    println(getFirstDigit(word))

    //Below is my code used to solve problem. Couldn't use variable j in nested if loop? Had to make it it i.
//    val input = readLine()!!.toString()
//
//    loop@ for (i in input) {
//        if (i in '0'..'9') {
//            println("$i")
//            break
//        }
//    }
}

private fun getFirstDigit(word: String): String {
    for (char in word) {
        if (char in '0'..'9') {
            return char.toString()
        }
    }
    return "No digit found."
}