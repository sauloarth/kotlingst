fun adding(x:Double, y:Double):Double{
    return x + y
}

fun adding(x:Int, y:Int):Int{
    return x + y
}

fun adding(x:Double, y:Double, z:Double):Double{
    return x + y + z
}

fun main(){
    println(adding(2.3, 5.9))
    println(adding(5, 7))
    println(adding(3.2,7.7, 9.4))
}