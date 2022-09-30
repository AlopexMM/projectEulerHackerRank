fun main() {
    val t = readLine()!!.trim().toInt()

    for (it in 1..t) {
        val n = readLine()!!.trim().toInt()
        var num = n
        var flag = false
        while (num > 10000) {
            if (isPalindrome(num)) {
                for (i in 999 downTo 100) {
                    val number = num.toFloat()
                    val division =  number / i
                    val strDivision = division.toString().split(".")
                    if (strDivision[0].length == 3 && strDivision[1] == "0") {
                        flag = true
                        break
                    }
                }
            }
            if (flag) {
                break
            }
            num --
        }
        println(num)
    }
}

fun isPalindrome(number: Int): Boolean {
    val n = number.toString()
    val reverseN = n.reversed()

    return n == reverseN
}