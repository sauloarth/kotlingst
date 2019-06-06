package com.car.maintin

// this is not an object
data class Person(val name:String, val age:Int, val gender:String)

fun main(){
    val person1 = Person("Saulo", 33, "Macho")
    println("Name: ${person1.name}")
    println("Age: ${person1.age}")
    println("Gender: ${person1.gender}")
}