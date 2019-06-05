// Função com valores padrão para os seus argumentos
fun adder(x:Double = 0.0, y:Double = 0.0 ):Double{
    return x + y
}

// Função com número variável de argumentos
fun displayNames( vararg names:String){
    for(name:String in names){
        println("Name: $name")
    }
}

fun main(){
    println("Sum 1: ${adder(3.2, 4.3)}") //normal use
    println("Sum 2: ${adder(5.9)}") // default value of y is used
    println("Sum 3: ${adder(y = 3.25)}")// default value of x is used

    println()

    //criação instantânea de array
    displayNames(*arrayOf("Saulo", "Larissa", "Samuel", "Emanuele"))

}