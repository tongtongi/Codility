import java.util.*

object StoneWall {
    fun solution(H: IntArray): Int {
        val stack = Stack<Int>()

        var count = 0

        for (h in H) {
            while (!stack.isEmpty() && stack.peek() > h){
                stack.pop()
            }

            if (stack.isEmpty()) {
                stack.add(h)
                count++
            } else if (stack.peek() == h) {
                stack.add(h)
                continue
            } else if (stack.peek() < h) {
                stack.add(h)
                count++
            }
        }
        return count
    }
}