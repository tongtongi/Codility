import java.util.*

object Fish {
    fun solution(A: IntArray, B: IntArray): Int {
        var numberOfFish = A.size
        val stackDownstreamFish = Stack<Int>()
        for (i in 0 until A.size) {
            if (B[i] == 1) {
                stackDownstreamFish.push(A[i])
            } else {
                while (!stackDownstreamFish.isEmpty()) {
                    if (stackDownstreamFish.peek() > A[i]) {
                        numberOfFish--
                        break;
                    } else {
                        stackDownstreamFish.pop()
                        numberOfFish--
                    }
                }
            }
        }
        return numberOfFish
    }
}