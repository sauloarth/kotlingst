package com.car.maintin

class IAmSingleton{
    var name:String?=""

    private constructor(){ // impede de criar instâncias a partir do construtor
        println("Instance was created.")
    }

    companion object {
        val instance: IAmSingleton by lazy { IAmSingleton() }
    }
}

fun main(){
    var p1 = IAmSingleton.instance // a única maneira de criar instancias será através do instance
    p1.name = "Pinoquio"

    var p2 = IAmSingleton.instance
    p2.name = "Jepeto"

    var p3 = IAmSingleton.instance
    p3.name = "Aladin"

    println("${p1.name} - ${p2.name} - ${p3.name}")
}