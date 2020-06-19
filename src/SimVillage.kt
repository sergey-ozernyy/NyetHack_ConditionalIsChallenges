fun main(args: Array<String>){
    runSimulation()


}

fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String{
    val structureType = "hospitals"
    var numBuildings = 5
    return {playerName: String ->
        val currenYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currenYear)"
    }
}

fun printConstructionCost(numBuildings:Int){
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}