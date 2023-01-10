fun main() {
    compareNumbers(5, 2)
    compareNumbers(5, 7)
    compareNumbers(5, 5)
}

fun compareNumbers(number1: Int, number2: Int) {
    if(number1 > number2){
        println("Number1 ist größer als Number1!")
    }else if(number2 > number1){
        println("Number2 ist größer als Number1!")
    }else println("Beide Zahlen sind identisch!")
}