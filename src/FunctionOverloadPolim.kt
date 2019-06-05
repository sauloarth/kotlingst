//Mesma função, mesmo número de parametros
//Um tratamento conforme o tipo do parâmetro passado.
fun showInfo(cardID:Int){
    println(cardID)
}

fun showInfo(name:String){
    println(name)
}

fun main(){
    showInfo(157393837)
    showInfo("Saulo")
}