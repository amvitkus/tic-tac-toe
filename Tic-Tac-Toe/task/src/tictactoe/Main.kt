package tictactoe

import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    println("Enter cells: ")
    val symbols = scanner.next()

    println("---------")
    println("| " + "${symbols[0]} " + "${symbols[1]} " + "${symbols[2]} " + "|")
    println("| " + "${symbols[3]} " + "${symbols[4]} " + "${symbols[5]} " + "|")
    println("| " + "${symbols[6]} " + "${symbols[7]} " + "${symbols[8]} " + "|")
    println("---------")
}