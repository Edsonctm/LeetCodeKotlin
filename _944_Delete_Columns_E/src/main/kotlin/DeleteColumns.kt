fun main(){

    val teste1 = arrayOf("cba","daf","ghi")
    val teste2 = arrayOf("a","b")
    val teste3 = arrayOf("zyx","wvu","tsr")
    val teste4 = arrayOf("abc")

    println(minDeletionSize(teste1))
    println(minDeletionSize(teste2))
    println(minDeletionSize(teste3))
    println(minDeletionSize(teste4))
}

fun minDeletionSize(strs: Array<String>): Int {
    val indexChar = strs[0].length
    val indexWord = strs.size - 1
    var ixChar = 0
    var contador = 0

    if(indexWord == 0) return indexWord

    while(ixChar < indexChar) {
        var ixWord = 0
        while (ixWord < indexWord){
            if (strs[ixWord][ixChar] > strs[ixWord + 1][ixChar]){
                contador++
                break
            }
           ixWord++
        }
        ixChar++
    }

    return contador
}