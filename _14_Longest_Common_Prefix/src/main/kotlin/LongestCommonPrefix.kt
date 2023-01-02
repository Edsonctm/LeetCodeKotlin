fun main() {
    val strs = arrayOf("flower","flow","flight")
    val strs2 = arrayOf("dog","racecar","car")
    val strs3 = arrayOf("a")
    val strs4 = arrayOf("reflower","flow","flight")
    val strs5 = arrayOf("aaa","aa","aaa")

    longestCommonPrefix(strs)
    longestCommonPrefix(strs2)
    longestCommonPrefix(strs3)
    longestCommonPrefix(strs4)
    longestCommonPrefix(strs5)

}

fun longestCommonPrefix(strs: Array<String>): String {
    var menorPalavra = strs[0]
    var resposta = ""
    var index = 0
    var contador = menorPalavra.length

    if(strs.isEmpty()) return ""
    if(strs.size == 1) return strs[0]

    strs.forEach {
        if(it == "") return ""
        if(it.length < menorPalavra.length){
            menorPalavra = it
        }
    }
    val strsFiltrado = strs.filter { it != menorPalavra }

    strsFiltrado.forEach{
        var i = 0
        while (i < it.length && contador > 0)
        if (index < menorPalavra.length && it[index] == menorPalavra[index]){
            index++
            i++
        } else if (index < contador) {
            contador = index
            i = it.length
            index = 0
        } else {
            i = it.length
            index = 0
        }
    }

    resposta = menorPalavra.substring(0, contador)

    return resposta

}