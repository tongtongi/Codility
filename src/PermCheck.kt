object PermCheck {
    fun solution(A: IntArray): Int {
        val arr = IntArray(A.size)

        for (i in 0 until A.size) {
            if (A[i] > A.size) {
                return 0
            }

            if (arr[A[i] - 1] == 0) {
                arr[A[i] - 1] = 1
            } else {
                return 0
            }
        }

        return 1
    }
}