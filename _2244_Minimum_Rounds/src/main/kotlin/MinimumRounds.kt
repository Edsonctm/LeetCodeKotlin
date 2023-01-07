fun main(){
    println(minimumRounds(intArrayOf(1,1000000000)) == -1)
    println(minimumRounds(intArrayOf(2,3,3))==-1)
    println(minimumRounds(intArrayOf(1,1))== 1)
    println(minimumRounds(intArrayOf(2,2,3,3,2,4,4,4,4,4))== 4)
    println(minimumRounds(intArrayOf(1,2,1))== -1)
}

fun minimumRounds(tasks: IntArray): Int {
    val counts = HashMap<Int, Int>()
    var result = 0

    // Counts up each taskId
    for (taskId in tasks) {
        counts.put(taskId, (counts.get(taskId) ?: 0) + 1)
    }

    // Calculates the rounds
    for (taskId in counts.keys) {
        val taskCnt = counts.get(taskId) ?: 1
        if (taskCnt == 1) return -1

        val div2 = (taskCnt / 2) + (taskCnt % 2)
        val div3 = (taskCnt / 3) + when(taskCnt % 3) {
            0 -> 0
            else -> 1
        }
        result += minOf(div2, div3)
    }

    return result
}