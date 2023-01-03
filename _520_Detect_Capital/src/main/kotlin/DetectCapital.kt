fun main(){
    println(detectCapitalUse("USA"))
    println(detectCapitalUse("FlaG"))

}

fun detectCapitalUse(word: String): Boolean {
    val resto = word.substring(1 until word.length)

    if (resto == "") return true

    if (word[0].isLowerCase()){
        resto.map{
            if (it.isUpperCase()) return false
        }
    }

    if (word[0].isUpperCase()){
        if (resto[0].isUpperCase()){
            resto.map {
                if (it.isLowerCase()) return false
            }
        } else {
            resto.map {
                if (it.isUpperCase()) return false
            }
        }
    }
    return true
}


