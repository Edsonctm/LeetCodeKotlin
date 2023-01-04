fun main(){

    println(isValid("()")) // true
    println(isValid("()[]{}")) // true
    println(isValid("(]")) // false
    println(isValid("{()}")) // true
    println(isValid("([)]")) // false
    println(isValid("([")) // false
    println(isValid("[([]])")) //false
}
fun isValid(s: String): Boolean {
    if (s.length%2 == 1) return false

    val open = arrayOf('(', '[', '{')
    val close = arrayOf(')', ']', '}')
    val acumulador = arrayListOf<Char>()

    s.map{
        if(it in open){
            acumulador.add(it)
        } else {
            if(acumulador.isEmpty()) return false
            if(close.indexOf(it) != open.indexOf(acumulador.last())){
                return false
            } else {
                acumulador.removeAt(acumulador.size - 1)
            }
        }
    }
    if (acumulador.isNotEmpty()) return false
    return true
}