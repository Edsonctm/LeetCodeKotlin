fun main () {
    println(searchInsert(intArrayOf(1,3,5,6),5)) // 2
    println(searchInsert(intArrayOf(1,3,5,6),2)) // 1
    println(searchInsert(intArrayOf(1,3,5,6),7)) // 4

}

fun searchInsert(nums: IntArray, target: Int): Int {

    if(nums.indexOf(target) >= 0) return nums.indexOf(target)

    val retorno = arrayListOf<Int>()
    var index = 0

    nums.forEach {
        if (target > it){
            retorno.add(it)
        } else {
            return retorno.size
        }
    }
    return retorno.size
}