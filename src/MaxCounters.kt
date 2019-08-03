object MaxCounters {
    fun solution(N: Int, A: IntArray): IntArray {
        var result = IntArray(N)
        var maxValue = 0
        var allValues = 0;
        for (i in 0 until A.size) {
            if (A[i] <= N) {
                if (result[A[i] - 1] < allValues) {
                    result[A[i] - 1] = allValues + 1
                } else {
                    result[A[i] - 1] = result[A[i] - 1] + 1
                }

                if (maxValue < result[A[i] - 1]) {
                    maxValue = result[A[i] - 1]
                }
            } else {
                allValues = maxValue
            }
        }

        for (i in 0 until result.size) {
            if (result[i] < allValues) {
                result[i] = allValues
            }
        }
        return result
    }
}