fun main(){

    println(removeDuplicates(intArrayOf(1,1,2)))
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}

fun removeDuplicates(nums: IntArray): Int {
    var index = 0
    var valorUnico = nums[index]

    nums.forEach {
        if (it > valorUnico) {
            valorUnico = it
            nums[++index] = it
        }
    }
    return index + 1
}