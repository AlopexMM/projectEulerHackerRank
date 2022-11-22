/*
Given number N find all minor or equal prime numbers and sum it
 */
import kotlin.math.sqrt

fun main() {
    val t = readLine()!!.trim().toInt()
    // first you need to calculate here the primes number up to 1000000
    // Then process the test
    val primes = mutableListOf <Int>()
    primes.add(2)
    for (i in 3..1000000) {
        if (i % 2 != 0) {
            var isPrime = true
            for (x in 2..sqrt(i.toDouble()).toInt()) {
                if (i.rem(x) == 0) {
                    isPrime = false
                    break
                }
            }
            if(isPrime) {
                primes.add(i)
            }
        }
    }

    for (i in 1..t) {
        val n = readLine()!!.trim().toInt()
        var result : Long = 0
        for (prime in primes) {
            if (prime <= n) {
                result += prime
            }
        }
        println(result)
    }
}