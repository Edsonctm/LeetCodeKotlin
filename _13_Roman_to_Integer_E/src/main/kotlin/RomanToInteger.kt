import java.util.*

fun main () {
    println("Digite o número em romano para a conversão:")
    val numeroEmRomano = readLine()?:""
    var contador = 0
    var index = 0

    val numerosRomanos = hashMapOf( Pair('I', 1), Pair('V', 5), Pair('X', 10), Pair('L', 50), Pair('C', 100),
        Pair('D', 500), Pair('M', 1000))

    if(numeroEmRomano.isEmpty()) resposta(0)
    numeroEmRomano.forEach {
        if (index + 1 == numeroEmRomano.length){
            contador += numerosRomanos[it]!!
        } else if (numerosRomanos[it]!! >= numerosRomanos[numeroEmRomano[index + 1]]!!){
            contador += numerosRomanos[it]!!
        } else {
            contador -= numerosRomanos[it]!!
        }
        index++
    }
    resposta(contador)
}

fun resposta(x: Int){
    println("O número romano digitado é igual a $x.")
    return main()
}
