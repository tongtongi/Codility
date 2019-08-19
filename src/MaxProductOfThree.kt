import kotlin.math.max

object MaxProductOfThree {
    fun solution(A: IntArray): Int {
        A.sortDescending()

        val first = A.take(3).reduce { acc, i -> acc * i }
        val second = A.takeLast(2).reduce { acc, i -> acc * i } * A[0]

        return max(first, second)
    }
}