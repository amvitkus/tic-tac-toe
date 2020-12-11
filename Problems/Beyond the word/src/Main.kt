import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()

    for (char in 'a'..'z') {
        if (char in word) {
            continue
        }
        print(char)
    }
}