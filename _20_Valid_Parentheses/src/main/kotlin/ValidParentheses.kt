fun main(){

    println(isValid("()")) // true
    println(isValid("()[]{}")) // true
    println(isValid("(]")) // false
    println(isValid("{()}")) // true
    println(isValid("([)]")) // false
    println(isValid("([")) // false
}

fun isValid(s: String): Boolean {
    var (check1, check2, check3) = Triple(0, 0, 0)
    val open = arrayOf('(', '[', '{')
    val close = arrayOf(')', ']', '}')

    if (s.length%2 == 1) return false

    s.map{
        when (it) {
            '(' -> check1++
            ')' -> check1--
            '[' -> check2++
            ']' -> check2--
            '{' -> check3++
            else -> check3--
        }
        if (check1 < 0 || check2 < 0 || check3 < 0) return false
        if (it in open && (s.indexOf(it) < s.length - 1 &&
            (s[s.indexOf(it)+1] in close &&
            close.indexOf(s[s.indexOf(it)+1]) != open.indexOf(it)))){
            return false
            }
    }
    if (check1 == 0 && check2 == 0 && check3 == 0) return true
    return false
}