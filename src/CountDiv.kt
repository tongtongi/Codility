object CountDiv {
    fun solution(A: Int, B: Int, K: Int): Int {
        val count1 = B / K
        val count2 = A / K
        var count = count1 - count2
        if (A % K == 0) {
            count++
        }

        return count
    }
}