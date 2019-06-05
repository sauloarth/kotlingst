val sum = {
    number1:Int, number2:Int -> number1 + number2
}

fun main(){
    println("My sum: ${sum(5,10)}")

    //funcional programing method

    val myNumberList = listOf<Int>(1,7,10,22,45,90)

    myNumberList.forEach{
        number -> println("number: $number")
    }
}