fun main() {
    // write your code here
    val input = readLine()!!
    val alphabet = ('a'..'z').joinToString("")
    println(if (input in alphabet) "true" else "false")
}