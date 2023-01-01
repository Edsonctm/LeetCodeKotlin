fun main(){
    val test1 = intArrayOf(2,7,11,15)
    val test12 = 9
    val test2 = intArrayOf(3,2,4) // 2,0 -- 1,2
    val test22 = 6
    val test3 = intArrayOf(3,3)
    val test32 = 6
    val test4 = intArrayOf(3,2,3)
    val test42= 6

    twoSum(test1, test12)
    twoSum(test2, test22)
    twoSum(test3, test32)
    twoSum(test4, test42)
}

fun twoSum(nums: IntArray, target: Int){
    val resposta = IntArray(2)
    var x: List<Int>

    nums.forEach {
        val resto = target - it
        x = nums.slice((nums.indexOf(it) +1) until nums.size)
        if (x.indexOf(resto) > -1){
            resposta.set(0, nums.indexOf(it))
            resposta.set(1, (x.indexOf(resto) + (nums.size - x.size)))
        }

    }
    println(resposta)
}