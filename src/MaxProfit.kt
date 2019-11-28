import kotlin.math.max

object MaxProfit {
    fun solution(A: IntArray): Int {

        if(A.isEmpty()){
            return 0
        }

        var minPrice = A[0]
        var maxPrice: Int
        var maxProfit = 0

        for (i in 0 until A.size - 1) {
            if (A[i + 1] <= A[i]) {
                if (A[i + 1] < minPrice) {
                    minPrice = A[i + 1]
                }
            } else {
                maxPrice = A[i + 1]
                maxProfit = max(maxProfit, maxPrice - minPrice)
            }

        }

        return maxProfit
    }
}