package com.car.maintin

open class SumWrong(){
    open fun sum(x:Int, y:Int):Int{
        return x + y + 3
    }
}

class SumRight:SumWrong{
    constructor():super(){}
    override fun sum(x:Int, y:Int):Int{
        return x + y
    }
}

fun main(){
    val operation = SumWrong()

    println("Can add but is wrong: ${operation.sum(5, 5)}")

    val operation1 = SumRight() as SumWrong
    //continua usando o metodo sum da classe que o sobrescreveu
    println("Can add in a right way: ${operation1.sum(5, 5)}")
}