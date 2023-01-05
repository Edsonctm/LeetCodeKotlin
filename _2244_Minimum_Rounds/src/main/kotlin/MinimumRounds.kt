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
    var rounds = 0
    val listaOrdenada = tasks.sorted()

    listaOrdenada.forEach {
        index ++
        if (acumulador.isEmpty() || it == acumulador.first()) acumulador.add(it)

        if (it > acumulador.first() || index == listaOrdenada.size){
            if(acumulador.size == 1) return -1
            when (acumulador.size % 3) {
                    0 -> rounds += acumulador.size / 3
                    1 -> rounds += (acumulador.size + 2) / 3
                    2 -> rounds += (acumulador.size + 1) / 3
                }
                acumulador.clear()
                acumulador.add(it)
        }
    }



    return rounds
}






//    listaOrdenada.forEach {
//        index++
//        if (acumulador.isEmpty()) {
//            acumulador.add(it)
//        } else if {
//            if (it > acumulador.first()) {
//                if (acumulador.size == 1) {
//                    return -1
//                } else {
//                    when (acumulador.size % 3) {
//                        0 -> rounds += acumulador.size / 3
//                        1 -> rounds += (acumulador.size + 2) / 3
//                        2 -> rounds += (acumulador.size + 1) / 3
//                    }
//                    acumulador.clear()
//                    acumulador.add(it)
//                }
//            } else {
//                acumulador.add(it)
//            }
//        } else {
//            if (index == listaOrdenada.size ) acumulador.add(it)
//        }
//    }
//    return rounds
//}
