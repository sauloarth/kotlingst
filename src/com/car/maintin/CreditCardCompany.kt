package com.car.maintin

//Interface
//Você precisa que uma estrutura específica seja seguida em quem implementar classes a partir da sua interface
//Não pode haver implementações na interface. Só dita estruturas (inclusive vars)
//Podem existir métodos na classe que não existem na interface na classe que a implementar

interface CreditCard{
    val cardNumber:String

    fun scoreIsPositive(age:Int):Boolean
}

//Implementações

class Mastercard(override val cardNumber:String ):CreditCard{
    override fun scoreIsPositive(age: Int): Boolean {
        return age > 50
    }
}

class Visa(override val cardNumber:String ):CreditCard{
    override fun scoreIsPositive(age: Int): Boolean {
        return age > 60
    }
}

//Delegation
//"Herdar implementação da interface" com base no tipo de objeto que receber

class PayPal(creditCardFlag:CreditCard):CreditCard by creditCardFlag{

}

fun main(){
    val cardMastercard = Mastercard("2987230982312341")
    val cardVisa = Visa("387398270298374")

    println("Positive Score for Mastercard? ${cardMastercard.scoreIsPositive(55)}")
    println("Positive Score for Visa? ${cardVisa.scoreIsPositive(55)}")

    val paypalWithMastercard = PayPal(cardMastercard)
    val paypalWithVisa = PayPal(cardVisa)

    println("Your are positive for PayPal based on your Mastercard? ${paypalWithMastercard.scoreIsPositive(55)}")
    println("Your are positive for PayPal based on your Visa? ${paypalWithVisa.scoreIsPositive(55)}")
}