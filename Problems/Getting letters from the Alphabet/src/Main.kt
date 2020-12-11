import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val x = input.next().single()
    var result = " "

    for (i in 'a'..'z') {
        if (i != x) {
            result += i
        } else
            return println(result)
    }

    //Code below is a way of solving it without being forced to use return
//    val word = input.next()
//    var result = " "
//
//    for (i in 'a'..'z') {
//        if (i in word) {
//            break
//        } else {
//            result += i
//        }
//    }
//    print(result)
}