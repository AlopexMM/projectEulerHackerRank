/*
You need to find the smallest positive number that is evenly divisible by all of the numbers from 1 to N

sample input
2
3
10

sample output
6
2520
 */

fun main() {
    val t = readLine()!!.trim().toInt()

    for (test in 1..t) {
        val n = readLine()!!.trim().toInt()
        var result = 2
        if (n == 1) {
            println(1)
        } else {
            while (true) {
                // Create a list of numbers that goes from 1 to N with all false values
                val numbersToDivide = BooleanArray(n)
                for ( i in 1..n ) {
                    if ( result.rem(i) == 0) {
                        val num = i - 1
                        numbersToDivide.set(num, true)
                    }
                }
                val allNumbersAre = numbersToDivide.all { it }
                if ( allNumbersAre ) {
                    break
                } else {
                    result ++
                }
            }
            println(result)
        }
    }
}