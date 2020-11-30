package tictactoe

import java.lang.Math.abs
import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)

    val cells = scanner.nextLine()
    val moves = cells.toCharArray()
    var index = 0

    println("---------")
    for (i in 0 until 3) {
        print("| ")
        for (j in 0 until 3) {
            print(moves[index])
            print(" ")
            index++
        }
        print("|")
        println()
    }
    println("---------")
    var s = "string"

    val xWins = moves[0] == 'X' && moves[1] == 'X' && moves[2] == 'X' ||
            moves[3] == 'X' && moves[4] == 'X' && moves[5] == 'X' ||
            moves[6] == 'X' && moves[4] == 'X' && moves[8] == 'X' ||
            moves[0] == 'X' && moves[3] == 'X' && moves[6] == 'X' ||
            moves[1] == 'X' && moves[4] == 'X' && moves[7] == 'X' ||
            moves[2] == 'X' && moves[5] == 'X' && moves[8] == 'X' ||
            moves[0] == 'X' && moves[2] == 'X' && moves[8] == 'X' ||
            moves[2] == 'X' && moves[4] == 'X' && moves[6] == 'X'

    val oWins = moves[0] == 'O' && moves[1] == 'O' && moves[2] == 'O' ||
            moves[3] == 'O' && moves[4] == 'O' && moves[5] == 'O' ||
            moves[6] == 'O' && moves[4] == 'O' && moves[8] == 'O' ||
            moves[0] == 'O' && moves[3] == 'O' && moves[6] == 'O' ||
            moves[1] == 'O' && moves[4] == 'O' && moves[7] == 'O' ||
            moves[2] == 'O' && moves[5] == 'O' && moves[8] == 'O' ||
            moves[0] == 'O' && moves[2] == 'O' && moves[8] == 'O' ||
            moves[2] == 'O' && moves[4] == 'O' && moves[6] == 'O'
    val xCount = moves.count { it == 'X' }
    val oCount = moves.count { it == 'O' }

    if (oWins && xWins || abs(xCount - oCount) >= 2) {
        s = "Impossible"
    } else if (moves.contains('_') && !oWins && !xWins) {
        s = "Game not finished"
    } else if (!moves.contains('_') && !oWins && !xWins) {
        s = "Draw"
    } else if (xWins) {
        s = "X wins"
    } else if (oWins) {
        s = "O wins"
    }
    print(s)
// The code below was my simple solution to get the program to pass the first time.
//    println("Enter cells: ")
//    val symbols = scanner.next()
//
//    println("---------")
//    println("| " + "${symbols[0]} " + "${symbols[1]} " + "${symbols[2]} " + "|")
//    println("| " + "${symbols[3]} " + "${symbols[4]} " + "${symbols[5]} " + "|")
//    println("| " + "${symbols[6]} " + "${symbols[7]} " + "${symbols[8]} " + "|")
//    println("---------")
//
//    if (symbols[0] == 'X' && symbols[1] == 'X' && symbols[2] == 'X') {
//        println("X wins")
//    } else if (symbols[0] == 'O' && symbols[1] == 'O' && symbols[2] == 'O') {
//        println("O wins")
//    } else if (symbols[3] == 'O' && symbols[4] == 'O' && symbols[5] == 'O') {
//        println("O wins")
//    } else if (symbols[3] == 'X' && symbols[4] == 'X' && symbols[5] == 'X') {
//        println("X wins")
//    } else if (symbols[6] == 'O' && symbols[7] == 'O' && symbols[8] == 'O') {
//        println("O wins")
//    } else if (symbols[6] == 'X' && symbols[7] == 'X' && symbols[8] == 'X') {
//        println("X wins")
//    } else if (symbols[2] == 'X' && symbols[4] == 'X' && symbols[6] == 'X') {
//        println("X wins")
//    } else if (symbols[2] == 'O' && symbols[5] == 'O' && symbols[8] == 'O') {
//        println("O wins")
//    } else if (symbols[2] == '_' && symbols[6] == '_' && symbols[8] == '_') {
//        println("Game not finished")
//    } else if (symbols[2] == '_' && symbols[5] == '_') {
//        println("Impossible") //example 6
//    } else if (symbols[0] == '_' && symbols[2] == '_') {
//        println("Impossible") // example 7
//    } else if (symbols[0] == '_' && symbols[5] == '_') {
//        println("Impossible")
//    } else {
//        println("Draw")
//    }
}
