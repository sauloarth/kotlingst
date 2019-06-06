package com.car.maintin

class Truck:CarOptions{
    var subType: String?=null

    constructor(type:String, model:String, price:Double, miles:Int, owner: String, subType:String):
            super(type, model, price, miles, owner){
        this.subType = subType
    }

    constructor(type:String, model:String, price:Double, miles:Int, subType:String):
            super(type, model, price, miles){
        this.subType = subType
    }

    //for overide use this word before the method
    override fun getCarPrice():Double{
        return this.price!! - ((this.miles!! * 500)/1000).toDouble()
    }

    //super access the parent version of method
    fun getCarPriceWrapper():Double{
        return super.getCarPrice()
    }


}

fun main(){
    val truck1 = Truck("Fiat", "Uno", 3002.2, 50, "Sebastião", "Reboque") //parentesis create object here
    println("=== Truck1 info ===")
    println("car object: ${truck1}")
    println("car model: ${truck1.model}")
    println("car owner: ${truck1.owner}")
    println("updated truck price: ${truck1.getCarPrice()}")
    println("updated truck price like a car: ${truck1.getCarPriceWrapper()}")

    println("=== Truck2 info ===")
    val truck2 = Truck("BMW", "X10", 22000.22, 200, "Lixo") //parentesis create object here
    println("car object: ${truck2}")
    println("car model: ${truck2.model}")
    println("car owner: ${truck2.subType}")
    println("updated truck price: ${truck2.getCarPrice()}")
    println("updated truck price like a car: ${truck2.getCarPriceWrapper()}")
}