fun main(){

    println(removeDuplicates(intArrayOf(1,1,2)))
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}

fun removeDuplicates(nums: IntArray): Int {
    val result = arrayListOf<Int>()

    nums.forEach {
        if (result.isEmpty()) result.add(it)
        if (it > result.last()) {
            result.add(it)
            nums[result.size -1] = it
        }
    }

    return result.size
}