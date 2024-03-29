import java.util.*

//LinkedList funciona como ArrayList mas ocupa apenas o espaço necessário para suas operações
//Contras: queries são mais lentas ( O(n) )

fun main(){

    val petList = LinkedList<String>()

    do{
        print("Enter a pet name or 0 to exit: ")
        val pet: String = readLine()!!.toString();

        if(pet != "0"){
            petList.add(pet)
        }
    }while(pet != "0")

    for(pet:String in petList){
        println("Your pet: $pet")
    }

    if(petList.contains("Cat")) {
        println("Qualified for special care.")
    }


}