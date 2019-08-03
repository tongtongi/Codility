object PermMissingElem {
    fun solution(A: IntArray): Int {
        val n = (A.size + 1).toLong()
        val sumOfAllElements = (n * (n + 1)) / 2

        return (sumOfAllElements - A.sum()).toInt()
    }
}