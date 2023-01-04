fun main(){

    println(isValid(")")) // true
    println(isValid("()[]{}")) // true
    println(isValid("(]")) // false
    println(isValid("{()}")) // true
    println(isValid("([)]")) // false
    println(isValid("([")) // false
    println(isValid("[([]])")) //false
}
fun isValid(s: String): Boolean {
    if(s.length % 2 == 1) return false
    val stack = arrayListOf<Char>()
    s.forEach {
        when(it) {
            '(', '[', '{' -> stack.add(it)
            ')' -> if (stack.lastOrNull() == '(') stack.removeAt(stack.size - 1) else return false
            '}' -> if (stack.lastOrNull() == '{') stack.removeAt(stack.size - 1) else return false
            ']' -> if (stack.lastOrNull() == '[') stack.removeAt(stack.size - 1) else return false
        }
    }
    return stack.isEmpty()
}