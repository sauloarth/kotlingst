package com.car.maintin

enum class So(){
    IOS, WINDOWS, ANDROID
}

abstract class Smartphone{
    var brand: String?=null
    var so: So?=null

    constructor(brand:String, so:So){ //no need this if class has just 1 constructor
        this.brand = brand
        this.so = so
    }

    abstract fun call(number:String) // open by default
}

class Pixel:Smartphone{
    constructor(brand:String, so:So):
            super(brand, so){

    }

    override fun call(number:String){
        println("Calling like Pixel to $number.")
    }
}

class Iphone:Smartphone{
    constructor(brand:String, so:So):
            super(brand, so){

    }

    override fun call(number:String){
        println("Calling like Iphone to $number.")
    }
}

fun main(){
    val cellphone1 = Pixel("Google", So.ANDROID)
    val cellphone2 = Iphone("Apple", So.IOS)

    cellphone1.call("9999-9999")
    cellphone2.call("9999-9999")
}