import kotlin.math.sqrt

fun main() {
    val primes = getListPrime(10000)
    val t = readLine()!!.trim().toInt()

    for (i in 1..t) {
        val n = readLine()!!.trim().toInt() - 1
        println(primes[n])


    }
}

fun getListPrime(positions: Int): List<Int> = ArrayList<Int>().apply{
    var prime = 2
    for (i in 0 until positions) {
        if (i == 0) {
            this.add(prime)
        } else {
            while (true) {
                prime += 1
                var isPrime = true
                if (prime.rem(2) != 0) {
                    for (x in 2..sqrt(prime.toDouble()).toInt()) {
                        if (prime.rem(x) == 0) {
                            isPrime = false
                            break
                        }
                    }
                } else {
                    isPrime = false
                }
                if (isPrime) {
                    this.add(prime)
                    break
                }
            }
        }
    }
}