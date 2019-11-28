object Dominator {
    fun solution(A: IntArray): Int {
        if (A.isEmpty())
            return -1

        val map = HashMap<Int, Int>()
        for (x in A) {
            if (map.containsKey(x)) {
                map[x] = map[x]!!.toInt() + 1
            } else {
                map[x] = 1
            }
        }

        val max = map.entries.maxBy { it.value }

        return if (max?.value!! > A.size / 2) {
            A.indexOf(max.key)
        } else {
            -1
        }
    }
}