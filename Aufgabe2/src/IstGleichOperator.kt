fun main() {
    isIntegerEqual(5, 5)
    isIntegerEqual(5, 10)
    isStringEqual("Hallo", "Welt")
    isStringEqual("Welt", "Welt")
}

fun isIntegerEqual(number1: Int, number2: Int) {
    if(number1 == number2){
        println("Die Zahlen sind gleich!")
    }else println("Die Zahlen sind ungleich")
}

fun isStringEqual(string1: String, string2: String) {
    if(string1 == string2){
        println("Die Strings sind gleich!")
    }else println("Die Strings sind ungleich")
}

/*

*/