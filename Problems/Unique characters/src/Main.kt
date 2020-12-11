import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val word = scanner.next()

    loop@ for (i in word) {
        for (j in word) {
            println("i = $i, j = $j")
            //if (word[i] == word[j] && i != j) continue
        }
    }
}