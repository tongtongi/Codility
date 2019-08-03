object OddOccurrencesInArray {
    fun solution(array: IntArray): Int {
        var result = array[0]

        for (i in 1 until array.size) {
            result = result xor array[i]
        }

        return result
    }
}