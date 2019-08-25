import java.util.*

object Nesting {
    fun solution(S: String): Int {
        if (S.isEmpty()) {
            return 1
        }
        val stack = Stack<Char>()
        for (i in 0 until S.length) {
            if (S[i] == ')') {
                if (stack.isEmpty()) {
                    return 0
                } else {
                    stack.pop()
                }
            } else {
                stack.push('(')
            }
        }

        return when (stack.isEmpty()) {
            true -> 1
            false -> 0
        }
    }


}