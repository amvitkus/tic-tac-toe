import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'y')
    val word = scanner.next()
    var count = 0
    var countVowel = 0
    var countConsonant = 0

    for (index in word.indices) {
        if (vowels.contains(word[index])) {
            countVowel++
            countConsonant = 0
        } else {
            countConsonant++
            countVowel = 0
        }

        if (countVowel == 3 || countConsonant == 3) {
            count++
            countConsonant = 1
            countVowel = 1
        }
    }

    println(count)
}