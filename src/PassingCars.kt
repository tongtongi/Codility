object PassingCars {
    fun solution(A: IntArray): Int {
        val listOfCarsTravellingEast = arrayListOf<Int>()
        for (i in 0 until A.size) {
            if (A[i] == 0) {
                listOfCarsTravellingEast.add(i)
            }
        }
        var sumOfPassCarPairs = 0

        for (i in 0 until listOfCarsTravellingEast.size) {
            val size = A.size - listOfCarsTravellingEast[i]
            val numberOfRemainingCarPass = size - (listOfCarsTravellingEast.size - i)
            sumOfPassCarPairs += numberOfRemainingCarPass
        }

        if (sumOfPassCarPairs < 0 || sumOfPassCarPairs > 1000000000)
            return -1
        return sumOfPassCarPairs
    }
}