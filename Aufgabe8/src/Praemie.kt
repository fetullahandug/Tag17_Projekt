fun main() {
    val duration: Int = 5

    if(duration <= 12){
        println("Keine Prämie!")
    }else if(duration >= 13 && duration <= 24){
        println("5€ Amazon Gutschein")
    }else if(duration >= 25 && duration <= 36){
        println("15€ Amazon Gutschein")
    }else if(duration >= 37 && duration <= 48){
        println("25€ Amazon Gutschein")
    }else if(duration >= 49){
        println("50€ Amazon Gutschein")
    }

    if(duration <= 12){
        println("Keine Prämie!")
    }else if(duration in 13..24){
        println("5€ Amazon Gutschein")
    }else if(duration in 25..36){
        println("15€ Amazon Gutschein")
    }else if(duration in 37..48){
        println("25€ Amazon Gutschein")
    }else if(duration >= 49){
        println("50€ Amazon Gutschein")
    }

}
