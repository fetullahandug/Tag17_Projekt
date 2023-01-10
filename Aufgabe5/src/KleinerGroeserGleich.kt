fun main() {
    println(compareSmall(5,7))
    println(compareBig(7,5))
    println(compareBig(8,8))
}

//Wenn die erste Zahl höchstens so groß ist wie die zweite Zahl, soll die Funktion true zurück geben, ansonsten false.

fun compareSmall(number1: Int, number2: Int): Boolean{
    return number1 <= number2
}

fun compareBig(number1: Int, number2: Int): Boolean{
    if(number1 <= number2){
        return true
    }else return false
}