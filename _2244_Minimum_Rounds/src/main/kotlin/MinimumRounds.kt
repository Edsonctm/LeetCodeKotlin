fun main(){
    println(minimumRounds(intArrayOf(1,1000000000)) == -1)
    println(minimumRounds(intArrayOf(2,3,3))==-1)
    println(minimumRounds(intArrayOf(1,1))== 1)
    println(minimumRounds(intArrayOf(2,2,3,3,2,4,4,4,4,4))== 4)
    println(minimumRounds(intArrayOf(1,2,1))== -1)
}

fun minimumRounds(tasks: IntArray): Int {
    if(tasks.size == 1) return -1

    var index = 0
    val acumulador = arrayListOf<Int>()
    val acumulador2 = arrayListOf<Int>()
    var rounds = 0
    val listaOrdenada = tasks.sorted()


    listaOrdenada.forEach {
        index++
        acumulador.add(it)
        if(it != acumulador.first() || index == listaOrdenada.size){

            acumulador2.addAll(acumulador)
            if (index != listaOrdenada.size || it != acumulador.first()) acumulador2.remove(it)
            if(acumulador2.size == 1) return -1

            when (acumulador2.size % 3) {
                    0 -> rounds += acumulador2.size / 3
                    1 -> rounds += (acumulador2.size + 2) / 3
                    2 -> rounds += (acumulador2.size + 1) / 3
                }
                acumulador.removeAll(acumulador2)
                acumulador2.clear()
            }

        }
    if (acumulador.size == 1) return -1
    return rounds
}