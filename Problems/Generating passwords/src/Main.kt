import java.lang.StringBuilder
import java.util.*
import java.util.concurrent.ThreadLocalRandom
import kotlin.random.Random.Default.nextInt

fun main() {
    // write your code here
    val lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    val uppercase = lowercase.map { it.toUpperCase() }.toCharArray()
    val digits = "0123456789".toCharArray()
    val allSymbols = lowercase + uppercase + digits

    val scanner = Scanner(System.`in`)

    val uppercaseCount = scanner.nextInt()
    val lowercaseCount = scanner.nextInt()
    val digitCount = scanner.nextInt()
    val totalSymbols = scanner.nextInt()
    val remainingPart = totalSymbols - digitCount - uppercaseCount - lowercaseCount

    val parts = generatePart(uppercase, uppercaseCount) +
            generatePart(lowercase, lowercaseCount) +
            generatePart(digits, digitCount) +
            generatePart(allSymbols, remainingPart)

    val password = parts.shuffled().fold("", { a, b -> chooseFromPair(a, b) })

    println(password)
}

fun generatePart(alphabet: CharArray, charCount: Int): List<Pair<Char, Char>> {
    return List(charCount) { (0..alphabet.lastIndex).random() }.map {
        Pair(alphabet[it], alphabet[(it + 1) % alphabet.size])
    }
}

fun chooseFromPair(password: String, nextPair: Pair<Char, Char>): String {
    val (first, second) = nextPair
    val lastSymbol = password.lastOrNull()

    return password + if (lastSymbol == first) second else first
}


// Solution below works
//------------------------------------------------
//    val scan = Scanner(System.`in`)
//    var uppers = scan.nextInt()
//    var lowers = scan.nextInt()
//    var digits = scan.nextInt()
//    val quantity = scan.nextInt()
//    var freeChoices = quantity - uppers - lowers - digits
//    if (freeChoices < 0) {
//        System.exit(1)
//    }
//    val r = ThreadLocalRandom.current()
//    val password = StringBuilder()
//    var isPasswordReady = false
//    var lastUpper = -1
//    var lastLower = -1
//    var lastDigit = -1
//    val options = PasswordPart.values()
//    while (!isPasswordReady) {
//        val partChoice = r.nextInt(0, options.size)
//        when (options[partChoice]) {
//            PasswordPart.DIGIT -> if (digits > 0 || freeChoices > 0) {
//                val result = options[partChoice][lastDigit, -1, r]
//                password.append(result.c)
//                lastDigit = result.i
//                if (digits == 0) {
//                    freeChoices--
//                } else {
//                    digits--
//                }
//            }
//            PasswordPart.LOWER -> if (lowers > 0 || freeChoices > 0) {
//                val result = options[partChoice][lastLower, lastUpper, r]
//                password.append(result.c)
//                lastLower = result.i
//                if (lowers == 0) {
//                    freeChoices--
//                } else {
//                    lowers--
//                }
//            }
//            PasswordPart.UPPER -> if (uppers > 0 || freeChoices > 0) {
//                val result = options[partChoice][lastUpper, lastLower, r]
//                password.append(result.c)
//                lastUpper = result.i
//                if (uppers == 0) {
//                    freeChoices--
//                } else {
//                    uppers--
//                }
//            }
//        }
//        isPasswordReady = uppers == 0 && lowers == 0 && digits == 0 && freeChoices == 0
//    }
//    println(password.toString())
//}
//
//internal enum class PasswordPart(private val pool: String) {
//    UPPER("QWERTYUIOPASDFGHJKLZXCVBNM"), LOWER("qwertyuiopasdfghjklzxcvbnm"), DIGIT("1234567890");
//
//    operator fun get(lastIndex: Int, additionalIndex: Int, random: ThreadLocalRandom): CharIndexHolder {
//        var i = random.nextInt(0, pool.length)
//        while (i == lastIndex || i == additionalIndex) {
//            i = random.nextInt(0, pool.length)
//        }
//        return CharIndexHolder(pool[i], i)
//    }
//}
//
//class CharIndexHolder internal constructor(var c: Char, var i: Int)


//-----------------------------------------------------------------------
//    val scanner = Scanner(System.`in`)
//    var a = scanner.nextLine()
//    var b = scanner.nextLine()
//    var c = scanner.nextLine()
//    var n = scanner.nextLine()
//
//    a = charArrayOf('A', 'B', 'C', 'D', 'Z').toString()
//    b = charArrayOf('a', 'b', 'c', 'd', 'z').toString()
//
//
//    var uppercase = List(25) { arrayOf(a)}
//    var lowercase = List(25) { arrayOf(b)}
    //var digits = List(99) {Random(0, 100)}

    //println("$uppercase$lowercase$digits")
