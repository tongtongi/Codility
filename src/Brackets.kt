import java.util.*

object Brackets {
    fun solution(S: String): Int {
        val stack = Stack<Char>()

        if (S.length == 0) {
            return 1
        }

        if (S.length % 2 != 0) {
            return 0
        }

        for (i in 0 until S.length) {
            if (S[i] == '(') {
                stack.push(')')
            } else if (S[i] == '{') {
                stack.push('}')
            } else if (S[i] == '[') {
                stack.push(']')
            } else {
                if (stack.isEmpty()) {
                    return 0
                }

                if (stack.pop() != S[i]) {
                    return 0
                }
            }
        }

        return if (stack.isEmpty()) {
            1
        } else {
            0
        }
    }

}