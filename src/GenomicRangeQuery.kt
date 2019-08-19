object GenomicRangeQuery {
    fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
        val result = IntArray(P.size)

        val arrayA = IntArray(S.length + 1)
        val arrayC = IntArray(S.length + 1)
        val arrayG = IntArray(S.length + 1)
        val arrayT = IntArray(S.length + 1)


        for (i in 0 until S.length) {
            when {
                S[i] == 'A' -> {
                    arrayA[i + 1] = arrayA[i] + 1
                    arrayC[i + 1] = arrayC[i]
                    arrayG[i + 1] = arrayG[i]
                    arrayT[i + 1] = arrayT[i]
                }
                S[i] == 'C' -> {
                    arrayA[i + 1] = arrayA[i]
                    arrayC[i + 1] = arrayC[i] + 1
                    arrayG[i + 1] = arrayG[i]
                    arrayT[i + 1] = arrayT[i]
                }
                S[i] == 'G' -> {
                    arrayA[i + 1] = arrayA[i]
                    arrayC[i + 1] = arrayC[i]
                    arrayG[i + 1] = arrayG[i] + 1
                    arrayT[i + 1] = arrayT[i]
                }
                S[i] == 'T' -> {
                    arrayA[i + 1] = arrayA[i]
                    arrayC[i + 1] = arrayC[i]
                    arrayG[i + 1] = arrayG[i]
                    arrayT[i + 1] = arrayT[i] + 1
                }
            }
        }

        for (i in 0 until P.size) {
            val start = P[i]
            val end = Q[i] + 1

            when {
                arrayA[end] - arrayA[start] > 0 -> result[i] = 1
                arrayC[end] - arrayC[start] > 0 -> result[i] = 2
                arrayG[end] - arrayG[start] > 0 -> result[i] = 3
                arrayT[end] - arrayT[start] > 0 -> result[i] = 4
            }
        }

        return result
    }
}