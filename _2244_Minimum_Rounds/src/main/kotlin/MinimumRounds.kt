fun main(){
    println(minimumRounds(intArrayOf(2,2,3,3,2,4,4,4,4,4)))
    println(minimumRounds(intArrayOf(2,3,3)))
}

fun minimumRounds(tasks: IntArray): Int {
    var index = 0
    val acumulador = arrayListOf<Int>()
    var rounds = 0
    val listaOrdenada = tasks.sorted()

    listaOrdenada.forEach {
        index++
        if (acumulador.isEmpty()) {
            acumulador.add(it)
        } else {
            if (it > acumulador.last() || index == listaOrdenada.size) {
                if (acumulador.size == 1) {
                    return -1
                } else {
                    when (acumulador.size % 3) {
                        0 -> rounds += acumulador.size / 3
                        1 -> rounds += (acumulador.size + 2) / 3
                        2 -> rounds += (acumulador.size + 1) / 3
                    }
                    acumulador.clear()
                    acumulador.add(it)
                }
            } else {
                acumulador.add(it)
            }
        }
    }
    return rounds
}
