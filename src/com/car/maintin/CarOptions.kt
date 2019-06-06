package com.car.maintin

open class CarOptions(){
    var type:String?=null
    var model:String?=null
    protected var price:Double?=null
    var miles:Int?=null
    var owner: String?=null

    constructor(type:String, model:String, price:Double, miles:Int, owner: String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.miles = miles
        this.owner = owner
    }

    constructor(type:String, model:String, price:Double, miles:Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.miles = miles
    }

    //open methods can be override
    open fun getCarPrice():Double{
        return this.price!! - ((this.miles!! * 100)/1000).toDouble()
    }
}

fun main(){
    val car = CarOptions("Fiat", "Uno", 3002.2, 50, "Sebastião") //parentesis create object here
    println("car object: ${car}")
    println("car model: ${car.model}")
    println("car owner: ${car.owner}")
    println("updated car price: ${car.getCarPrice()}")

    val car2 = CarOptions("BMW", "X10", 22000.22, 200) //parentesis create object here
    println("car object: ${car2}")
    println("car model: ${car2.model}")
    println("car owner: ${car2.owner}")
    println("updated car price: ${car2.getCarPrice()}")
}