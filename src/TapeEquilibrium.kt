import kotlin.math.abs

object TapeEquilibrium {
    fun solution(A: IntArray): Int {
        var diff = Int.MAX_VALUE
        val sum = A.sum()
        var inc = 0
        for (i in 0 until A.size) {
            inc += A[i]
            var temp = abs(sum - 2 * inc)
            if (temp < diff) {
                diff = temp
            }
        }

        return diff
    }
}