object CyclicRotation {
    fun solution(A: IntArray, K: Int): IntArray {
        if (K == A.size)
            return A

        val result = IntArray(A.size)

        for (i in 0 until A.size) {
            result[(i + K) % A.size] = A[i]
        }

        return result
    }
}