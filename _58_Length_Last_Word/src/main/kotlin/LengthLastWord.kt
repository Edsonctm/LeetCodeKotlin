fun main (){
    println(lengthOfLastWord(""))
}

fun lengthOfLastWord(s: String): Int {
    val x = s.trim().reversed().substringBefore(" ")
    return x.length
}