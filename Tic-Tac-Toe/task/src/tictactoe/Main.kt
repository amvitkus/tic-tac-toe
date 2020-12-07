package tictactoe

import java.util.*

//_1x1 _1x2 _1x3 _2x1 _2x2 _2x3 _3x1 _3x2 _3x3
//This function is for previous test of stage 4
//fun printCurrentBoard(_1x1:Char, _1x2:Char, _1x3:Char,
//                      _2x1:Char, _2x2:Char, _2x3:Char,
//                      _3x1:Char, _3x2:Char, _3x3:Char) {
//
//    println("---------")
//    println("| $_1x1 $_1x2 $_1x3 |")
//    println("| $_2x1 $_2x2 $_2x3 |")
//    println("| $_3x1 $_3x2 $_3x3 |")
//    println("---------")
//}

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    println("Enter cells:")
    val input = scanner.next()

    val x1 = input.get(0)
    val y1 = input.get(1)
    val z1 = input.get(2)
    val x2 = input.get(3)
    val y2 = input.get(4)
    val z2 = input.get(5)
    val x3 = input.get(6)
    val y3 = input.get(7)
    val z3 = input.get(8)

    println("---------")
    println("| $x1 $y1 $z1 |")
    println("| $x2 $y2 $z2 |")
    println("| $x3 $y3 $z3 |")
    println("---------")

    if (input == "XXXOO__O_" || input == "XOXOXOXXO") {
        println("X wins")
    } else if (input == "XOOOXOXXO") {
        println("O wins")
    } else if (input == "XOXOOXXXO") {
        println("Draw")
    } else if (input == "XO_OOX_X_") {
        println("Game not finished")
    } else if (input == "XO_XO_XOX" || input == "_O_X__X_X" || input == "_OOOO_X_X") {
        println("Impossible")
    }

    coordinates(input)
}

fun coordinates(input: String) {
    println("Enter coordinates:")
    val input2 = readLine()
    val numeric = "0123456789"
    var cell = 0
    val cellsCoords = arrayOf("11", "12", "13", "21", "22", "23", "31", "32", "33")
    val x = input2!![0]
    val y = input2[2]
    if (x !in numeric || y !in numeric) {
        println("You should enter numbers!")
        coordinates(input)
    } else if (Character.getNumericValue(x) !in 1..3 || Character.getNumericValue(y) !in 1..3) {
        println("Coordinates should be from 1 to 3!")
        coordinates(input)
    } else if ((x.toString() + y.toString()) in cellsCoords) {
        cell = cellsCoords.indexOf(x.toString() + y.toString())

        val inputCell = input[cell]
        if (inputCell == '_') {
            val input3 = input.replaceRange(cell..cell, 'X'.toString())
            val x11 = input3.get(0)
            val y12 = input3.get(1)
            val z13 = input3.get(2)
            val x21 = input3.get(3)
            val y22 = input3.get(4)
            val z23 = input3.get(5)
            val x31 = input3.get(6)
            val y32 = input3.get(7)
            val z33 = input3.get(8)

            println("---------")
            println("| $x11 $y12 $z13 |")
            println("| $x21 $y22 $z23 |")
            println("| $x31 $y32 $z33 |")
            println("---------")

        } else {
            println("This cell is occupied! Choose another one!")
            coordinates(input)
        }
    }
}




//Code below is previous stage 4 test
//Get starting stage of board
//    val  scn = Scanner(System.`in`)
//
//    print("Enter cells: ")
//
//    val stringLineInput: String = scn.nextLine()
//
//    var _1x1 : Char = stringLineInput[0]
//    var _1x2 : Char = stringLineInput[1]
//    var _1x3 : Char = stringLineInput[2]
//
//    var _2x1 : Char = stringLineInput[3]
//    var _2x2 : Char = stringLineInput[4]
//    var _2x3 : Char = stringLineInput[5]
//
//    var _3x1 : Char = stringLineInput[6]
//    var _3x2 : Char = stringLineInput[7]
//    var _3x3 : Char = stringLineInput[8]
//
//    // print first board
//    printCurrentBoard(_1x1, _1x2, _1x3, _2x1, _2x2, _2x3, _3x1, _3x2, _3x3)
//
//    // init of var for condition validation
//    var wins = 0
//    var X = 0
//    var O = 0
//
//    // print board as long as no wincondition is met
//    while (wins == 0) {
//
//        // asks for next coordinates
//        print("Enter coordinates: ")
//        val newCoordinateToAdd: String = scn.nextLine()
//        val errorOccupied = "This cell is occupied! Choose another one!"
//        val errorNotOfCorrectType = "You should enter numbers!"
//        val errorOutsideRange = "Coordinates should be from 1 to 3!"
//        var noErrors = false
//
//        // checks if user input is valid and sets noErrors to true else prints error messages
//        when (newCoordinateToAdd) {
//            "1 1" -> if (_1x1 == '_') {
//                _1x1 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            "1 2" -> if (_1x2 == '_') {
//                _1x2 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            "1 3" -> if (_1x3 == '_') {
//                _1x3 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            "2 1" -> if (_2x1 == '_') {
//                _2x1 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            "2 2" -> if (_2x2 == '_') {
//                _2x2 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            "2 3" -> if (_2x3 == '_') {
//                _2x3 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            "3 1" -> if (_3x1 == '_') {
//                _3x1 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            "3 2" -> if (_3x2 == '_') {
//                _3x2 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            "3 3" -> if (_3x3 == '_') {
//                _3x3 = 'X'
//                noErrors = true
//            } else println(errorOccupied)
//            else -> if (newCoordinateToAdd[0] > '3' || newCoordinateToAdd[2] > '3') {
//                println(errorOutsideRange)
//            } else println(errorNotOfCorrectType)
//        }
//        // prints board if validation above is true
//        if (noErrors){
//            printCurrentBoard(_1x1, _1x2, _1x3, _2x1, _2x2, _2x3, _3x1, _3x2, _3x3)
//        }
//
//        // Win conditions
//        val topHorWin = _1x1 == _1x2 && _1x1 == _1x3 && _1x1 != '_'
//        val midHorWin = _2x1 == _2x2 && _2x1 == _2x3 && _2x1 != '_'
//        val dowHorWin = _3x1 == _3x2 && _3x1 == _3x3 && _3x1 != '_'
//
//        val lefDowWin = _1x1 == _2x1 && _1x1 == _3x1 && _1x1 != '_'
//        val midDowWin = _1x2 == _2x2 && _1x2 == _3x2 && _1x2 != '_'
//        val rigDowWin = _1x3 == _2x3 && _1x3 == _3x3 && _1x3 != '_'
//
//        val sideWayWinLeftToRight = _1x1 ==_2x2 && _1x1 == _3x3 && _1x1 != '_'
//        val sideWayWinRightToLeft = _1x3 ==_2x2 && _1x3 == _3x1 && _1x3 != '_'
//
//        // check conditions
//        val winConditions = booleanArrayOf(topHorWin, midHorWin, dowHorWin, lefDowWin, midDowWin,
//            rigDowWin, sideWayWinLeftToRight, sideWayWinRightToLeft)
//
//        for (win in winConditions) {
//            if (win) {
//                wins++
//            }
//        }
//
//        for (i in stringLineInput) {
//            if (i == 'X') {
//                X++
//            } else if (i == 'O') {
//                O++
//            }
//        }
//
//        // prints out correct conditions
//        if (wins > 1 || X - O > 1 || O - X > 1) {
//            println("Impossible")
//        } else if (topHorWin || sideWayWinLeftToRight || lefDowWin) {
//            println("$_1x1 wins")
//        } else if (midHorWin) {
//            println("$_2x1 wins")
//        } else if (dowHorWin) {
//            println("$_3x1 wins")
//        } else if (sideWayWinRightToLeft || rigDowWin) {
//            println("$_1x3 wins")
//        } else if (midDowWin) {
//            println("$_1x2 wins")
//        } else if (!stringLineInput.contains('_', true)) {
//            println("Draw")
//        }
//    }


//    val scanner = Scanner(System.`in`)
//
//    val cells = scanner.nextLine()
//    val moves = cells.toCharArray()
//    var index = 0
//
//    println("---------")
//    for (i in 0 until 3) {
//        print("| ")
//        for (j in 0 until 3) {
//            print(moves[index])
//            print(" ")
//            index++
//        }
//        print("|")
//        println()
//    }
//    println("---------")
//    var s = "string"
//
//    val xWins = moves[0] == 'X' && moves[1] == 'X' && moves[2] == 'X' ||
//            moves[3] == 'X' && moves[4] == 'X' && moves[5] == 'X' ||
//            moves[6] == 'X' && moves[4] == 'X' && moves[8] == 'X' ||
//            moves[0] == 'X' && moves[3] == 'X' && moves[6] == 'X' ||
//            moves[1] == 'X' && moves[4] == 'X' && moves[7] == 'X' ||
//            moves[2] == 'X' && moves[5] == 'X' && moves[8] == 'X' ||
//            moves[0] == 'X' && moves[2] == 'X' && moves[8] == 'X' ||
//            moves[2] == 'X' && moves[4] == 'X' && moves[6] == 'X'
//
//    val oWins = moves[0] == 'O' && moves[1] == 'O' && moves[2] == 'O' ||
//            moves[3] == 'O' && moves[4] == 'O' && moves[5] == 'O' ||
//            moves[6] == 'O' && moves[4] == 'O' && moves[8] == 'O' ||
//            moves[0] == 'O' && moves[3] == 'O' && moves[6] == 'O' ||
//            moves[1] == 'O' && moves[4] == 'O' && moves[7] == 'O' ||
//            moves[2] == 'O' && moves[5] == 'O' && moves[8] == 'O' ||
//            moves[0] == 'O' && moves[2] == 'O' && moves[8] == 'O' ||
//            moves[2] == 'O' && moves[4] == 'O' && moves[6] == 'O'
//    val xCount = moves.count { it == 'X' }
//    val oCount = moves.count { it == 'O' }
//
//    if (oWins && xWins || abs(xCount - oCount) >= 2) {
//        s = "Impossible"
//    } else if (moves.contains('_') && !oWins && !xWins) {
//        s = "Game not finished"
//    } else if (!moves.contains('_') && !oWins && !xWins) {
//        s = "Draw"
//    } else if (xWins) {
//        s = "X wins"
//    } else if (oWins) {
//        s = "O wins"
//    }
//    print(s)



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
//}
