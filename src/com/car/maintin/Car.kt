package com.car.maintin

class Car(val type:String, val model:String, val price:Double, val miles:Int, val owner: String){
    init {
        println("Object Car was created.")
    }

    fun getCarPrice():Double{
        return this.price - ((this.miles * 100)/1000).toDouble()
    }
}

fun main(){
    val car = Car("Fiat", "Uno", 3002.2, 50, "Sebastião") //parentesis create object here
    println("car object: ${car}")
    println("car model: ${car.model}")
    println("car owner: ${car.owner}")
    println("updated car price: ${car.getCarPrice()}")
}