object MissingInteger {
    fun solution(A: IntArray): Int {
        var map = HashMap<Int, Boolean>()
        var smallest = 1
        for (i in 0 until A.size) {
            map.put(A[i], true)
        }

        while (map.containsKey(smallest)) {
            smallest++
        }

        return smallest
    }
}