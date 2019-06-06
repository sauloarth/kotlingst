package com.car.maintin

import java.util.*

class Human(var name:String, var age:Int):Comparable<Human>{
    override fun compareTo(other: Human): Int {
        return other.age - this.age
    }
}

fun main(){
    val peoples = ArrayList<Human>()
    peoples.add(Human("Dali", 13))
    peoples.add(Human("Jon", 22))
    peoples.add(Human("San", 7))
    peoples.add(Human("Petrit", 35))
    peoples.add(Human("Morbid", 28))
    peoples.add(Human("Hon", 5))
    peoples.add(Human("Nofli", 19))

    println("=== Before ordering ===")
    for(human in peoples){
        println("${human.name}, ${human.age}")
    }

    println("=== After ordering ===")
    Collections.sort(peoples)

    for(human in peoples){
        println("${human.name}, ${human.age}")
    }
}