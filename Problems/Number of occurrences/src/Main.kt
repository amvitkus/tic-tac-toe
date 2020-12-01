fun main() {
    // write your code here
    val str = readLine()!!
    val sub = readLine()!!

    val count = str.split(sub).size - 1
    println(count)
}