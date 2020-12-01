fun main() {
    // write your code here
    val s = readLine()!!.toLowerCase()
    val gc = s.count { i -> i == 'c' || i == 'g' }
    val ratio = gc.toDouble() / s.length
    println(ratio * 100)
}