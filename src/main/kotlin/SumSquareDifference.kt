import kotlin.math.abs


/*
First you receive the N number of test.
Second you receive the N number that you need to calculate with the follow formula
(1 + ... + N ) ** 2 + (1**2 + ..**2 + N**2)
 */

fun main() {
    val t = readLine()!!.trim().toInt()

    for (i in 1..t) {
        val n = readLine()!!.trim().toInt()

        if (n == 0) {
            println(1)
        } else {
            var res1 = 0.0
            var res2 = 0.0
            for (i in 1..n) {
                res1 += i.toDouble()
                res2 += i.toDouble() * i.toDouble()
            }
            val result = (res1 * res1) - res2
            println(abs(result).toInt())
        }

    }
}