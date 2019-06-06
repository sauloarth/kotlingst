package com.car.maintin

class TypesOfData<T>(typeOfData:T){
    init {
        println(typeOfData)
    }
}

fun main(){
    val thisIsALetter: TypesOfData<String> = TypesOfData("X")
    val thisIsANumber: TypesOfData<Int> = TypesOfData(2)
    val thisIsABoolean = TypesOfData(true) // alternative initialization
}