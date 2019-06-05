fun main(){

    // On HashMap have <K,V> pair. key could not repeat
    // Kotling way: hashMapOf<K,V>()

    val team = hashMapOf<String, String>()

    team["atacante"] = "Ronaldinho"
    team["zagueiro"] = "Roberto Carlos"
    team["goleiro"] = "Dida"

    println("=== Composição do Time ====")

    for(key:String in team.keys){
        println("Jogador: ${team[key]}, Posição: $key")
    }
}