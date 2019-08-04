object MinAvgTwoSlice {
    fun solution(A: IntArray): Int {
        val sums = IntArray(A.size + 1)
        for (i in 0 until A.size) {
            sums[i + 1] = sums[i] + A[i]
        }

        var minAvg = Double.MAX_VALUE
        var index = 0
        for (i in 0 until A.size - 1) {
            val tempAvg = (sums[i + 2] - sums[i]) / 2.0
            if (tempAvg < minAvg) {
                minAvg = tempAvg
                index = i
            }
            if (i < A.size - 2) {
                val tempAvg2 = (sums[i + 3] - sums[i]) / 3.0
                if (tempAvg2 < minAvg) {
                    minAvg = tempAvg2
                    index = i
                }
            }

        }

        return index
    }
}