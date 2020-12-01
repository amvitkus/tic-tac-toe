fun main() {
    // write your code here
    val input = readLine()!!
    if ("the" in input.toLowerCase()) {
        println(input.toLowerCase().indexOf("the"))
    } else {
        println(-1)
    }
}