fun main() {
    print(solution(72))
}

fun solution(n: Int): Boolean {
    for (i in 2 until n / 2) {
        if (n % i == 0) {
            var tempInt = n / i
            while (tempInt % i == 0) {
                tempInt /= i
            }
            if (tempInt == 1)
                return true
        }
    }
    return false
}
