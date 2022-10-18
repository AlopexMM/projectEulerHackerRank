/*
Check if exists any Pythagorean triplet for which a + b + c = N
Find the maximum possible value of abc among all such Pythagorean triplets, if there is no such Pythagorean triplet print -1
Because is Pythagorean triplet abc must respect the follow condition a < b < c
 */

fun main() {
    val tests = readLine()!!.trim().toInt()

    for (t in 1..tests) {
        val n = readLine()!!.trim().toInt()
        var res = -1
        if (n.rem(2) != 1) {
            for (a in 1..n/3){
                var b = ((n*n)-(2*n*a))/(-2*a + 2*n)
                var c = n - a - b
                if (a * a + b * b == c * c && a < b && b < c) {
                    res = a * c * b
                }
            }
        }

        println(res)

    }
}