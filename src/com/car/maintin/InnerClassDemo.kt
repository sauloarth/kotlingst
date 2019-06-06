package com.car.maintin

class HumanBody(val name: String){

    inner class Organ(val organName: String){
        fun description(){
            println("Body of $name has a $organName")
        }
    }

}

fun main(){
    val human1 =  HumanBody("Mike").Organ("heart")

    human1.description()
}