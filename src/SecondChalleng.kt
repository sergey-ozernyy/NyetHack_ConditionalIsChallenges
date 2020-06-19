fun main (args: Array<String>){
    val name = "Madrigal"
    val healthPoints = 100
    val isBlessed = true
    val isImmortal = false

    //Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal

    val auraColor = auraColor(auraVisible)



    val healthStatus = formatHealthStatus(healthPoints, isBlessed)



    val playerStatus = when (castFireball()) {
        in 1..10 -> "Tipsy"
        in 11..20 -> "Sloshed"
        in 21..30 -> "Soused"
        in 31..40 -> "Stewed"
        else -> "..gbverg3343g"
    }
    //Состояние игрока
    printPlayerStatus(auraColor, isBlessed, name, healthStatus, playerStatus)

}

private fun printPlayerStatus(
        auraColor: String,
        isBlessed: Boolean,
        name: String,
        healthStatus: String,
        playerStatus: String
) {
    println(
            "(Aura: $auraColor) " +
                    "(Blassed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("$name $healthStatus And $playerStatus!")
}

private fun auraColor(auraVisible: Boolean) = if (auraVisible) "GREEN" else "NONE"



private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
        when (healthPoints) {
            100 -> "is in excellent condition!"
            in 90..99 -> "has a few scratches."

            in 75..89 -> if (isBlessed) {
                "has some minor wounds but is healing quite quickly!"
            } else {
                "has some minor wounds."
            }
            in 15..74 -> "looks pretty hurt."
            else -> "is in awful condition!"
        }




private fun castFireball(numFireballs:Int = 2):Int {
    println("A glass of Fireball springs into existens.(x$numFireballs)")
    val crazyLavel = if (numFireballs in 1..50) numFireballs else if (numFireballs < 1) 1 else 50
    return crazyLavel

}
