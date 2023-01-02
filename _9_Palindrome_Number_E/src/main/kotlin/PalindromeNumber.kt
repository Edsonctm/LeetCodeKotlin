fun main() {

    ehPalindromo(121)
    ehPalindromo(-121)
    ehPalindromo(10)
}

fun ehPalindromo(number: Int?): Boolean{
    val numeroReverso = number.toString().reversed()

    return(number.toString() == numeroReverso)
}