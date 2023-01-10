fun main() {
    isDoubleUnequal(5.0, 10.0)
    isDoubleUnequal(10.0, 10.0)
    isBooleanUnequal(false, true)
    isBooleanUnequal(true, true)
}

fun isDoubleUnequal(number1: Double, number2: Double) {
    if(number1 != number2){
        println("Die Zahlen sind ungleich!")
    }else println("Die Zahlen sind gleich")
}

fun isBooleanUnequal(boolean1: Boolean, boolean2: Boolean) {
    if(boolean1 != boolean2){
        println("Die Boooleans sind ungleich!")
    }else println("Die Booleans sind gleich")
}
