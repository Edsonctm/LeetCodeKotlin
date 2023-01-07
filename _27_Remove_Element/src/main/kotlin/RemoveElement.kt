fun main(){
    println(removeElement(intArrayOf(3,2,2,3), 3))
    println(removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2))


}

fun removeElement(nums: IntArray, `val`: Int): Int {
    val novosNumeros = arrayListOf<Int>()
    var index = 0

    nums.forEach {
        if (it != `val`){
            novosNumeros.add(it)
            index++
        }
    }
    index = 0
    for (numero in  novosNumeros){
        nums[index] = numero
        index++
    }
    nums

    return novosNumeros.size
}