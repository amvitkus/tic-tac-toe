fun main() {
    // write your code here
    val url = readLine()!!.split("?").drop(1).joinToString().split("&") // [pass=12345, port=8080, cookie=, host=localhost]
    var pass = ""
    var port = ""
    var cookie = ""
    var name = ""
    var host = ""

    for (i in url.indices) {

        if (url[i].take(4) == "port") {
            port += url[i].drop(5)
            if (port == "") port = "not found"
            println("port : $port")
        }
        if (url[i].take(4) == "name") {
            name += url[i].drop(5)
            if (name == "") name = "not found"
            println("name : $name")
        }
        if (url[i].take(6) == "cookie") {
            cookie += url[i].drop(7)
            if (cookie == "") cookie = "not found"
            println("cookie : $cookie")
        }
        if (url[i].take(4) == "host") {
            host += url[i].drop(5)
            if (host == "") host = "not found"
            println("host : $host")
        }
        if (url[i].take(4) == "pass") {
            pass += url[i].drop(5)
            println("pass : $pass")
        }
    }
    if (url[0].take(4) == "pass") {
        println("password : $pass")
    }
    try {
        if (url[4].take(4) == "pass") {
            println("password : $pass")
        }
    } catch (e: IndexOutOfBoundsException) {

    }
//    if (url.contains("pass")) {
//        println("password : $pass")
//    }
}