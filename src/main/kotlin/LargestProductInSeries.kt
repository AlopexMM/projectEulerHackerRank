/*
First you receive the number of test T
Second you receive two numbers N and K, N is the size of the next line number and K how much of consecutive numbers you take
until you finish the number.
Third you receive the number where you take the collections of numbers
Then you calculate what number in the collection when you multiply each one you have de maximum number and print this one
 */

fun main() {
    val t = readLine()!!.trim().toInt()

    for (i in 1..t) {
        val k = readLine()!!.split(" ")[1].toInt()
        val n = readLine()!!.trim().toString()
        var res = 0
        for (x in 0 until n.length - k + 1 ) {
            var number = 1
            for (y in x until (k+x)) {
                number *= n[y].digitToInt()
            }
            if (number > res) {
                res = number
            }
        }

        println(res)
    }
}