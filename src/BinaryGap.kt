object BinaryGap {
    fun solution(N: Int): Int {
        var maxCountZero = 0;
        var count = 0;
        var number = N;
        var findOne = false;

        while (number != 0) {
            var bit = number and 1

            if (bit == 1) {
                findOne = !findOne
                if (count >= maxCountZero) {
                    maxCountZero = count;
                    count = 0;
                    findOne = true;
                }
            } else if (findOne) {
                count++;
            }
            number = number shr 1

        }
        return maxCountZero;
    }
}