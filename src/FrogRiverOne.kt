object FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        val set = HashSet<Int>()
        var res = -1
        for (i in 0 until A.size) {
            if (A[i] <= X) {
                set.add(A[i])
            }

            if (set.size == X) {
                res = i
                break
            }
        }
        return res
    }
}