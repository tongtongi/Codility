object Triangle {
    fun solution(A: IntArray): Int {
        A.sort()
        for (i in 0 until A.size - 2) {
            if (A[i].toLong() + A[i + 1].toLong() > A[i + 2]) {
                return 1
            }
        }

        return 0
    }
}