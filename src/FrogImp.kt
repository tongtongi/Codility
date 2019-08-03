object FrogImp {
    fun solution(X: Int, Y: Int, D: Int): Int {
        val distance = Y - X
        var result = (distance / D)
        if (result * D < distance)
            result++

        return result
    }
}