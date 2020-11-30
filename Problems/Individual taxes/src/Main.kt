import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val countryNumbers = scanner.nextInt()
    val countryIncome = IntArray(countryNumbers) { scanner.nextInt() }
    val countryTaxes = IntArray(countryNumbers) { scanner.nextInt() }
    val result = arrayListOf<Int>()
    for (i in countryIncome.indices) {
        result.add(countryIncome[i] * countryTaxes[i])
    }
    println(result.indexOf(result.max()!!) + 1)


//    val n = scanner.nextDouble()
//    val arr1 = DoubleArray(n.toInt()){scanner.nextDouble()}
//    for (i in arr1.indices) {
//        arr1[i] = arr1[i] * scanner.nextDouble() / 100
//    }
//    println(arr1.indexOf(arr1.max()!!) + 1)
}