package com.car.maintin

//extend a class we doesn't have access
fun ArrayList<Int>.findMax():Int{
    var maxNumber = 0
    for(number:Int in this){
        if(maxNumber < number) {
            maxNumber = number
        }
    }
    return maxNumber
}

fun main(){
    val listOfNumbers = arrayListOf<Int>(3, 9, 17, 22, 50, 97)

    for(number:Int in listOfNumbers){
        println("number: $number")
    }

    println("Max number: ${listOfNumbers.findMax()}")

}