fun main(){
    println(plusOne(intArrayOf(2,1,2)))
    println(plusOne(intArrayOf(2,1,2)))
    println(plusOne(intArrayOf(2,1,2)))
    println(plusOne(intArrayOf(2,1,2)))
}

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.lastIndex downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }
    val result = IntArray(digits.size + 1)
    result[0] = 1
    return result
}