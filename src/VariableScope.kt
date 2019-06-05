
var globalName: String?=null

fun otherScope(name:String){
    val secretName:String = "Secret"
    println("secretName accessible in otherScope: $secretName")
    val name:String = "Other"
    println("name var in otherScope: $name")
    globalName = "Defined in otherScope"
    println("globalName now is: $globalName ")
}

fun main(){
    val name: String = "Saulo"
    println("name var in main: $name")
    // secretName = "Not secret" // cannot be write
    globalName = "Defined in main"
    println("globalName now is: $globalName")
    otherScope("The guy")
}