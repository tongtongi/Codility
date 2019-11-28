import kotlin.math.max

object MaxSliceSum {
    fun solution(A: IntArray): Int {
        if (A.isEmpty()) {
            return 0
        }
        var currentSum = A[0]
        var maxSum = A[0]
        for (i in 0 until A.size - 1) {
            currentSum = max(currentSum + A[i + 1], A[i + 1])
            maxSum = max(maxSum, currentSum)
        }

        return maxSum
    }
}