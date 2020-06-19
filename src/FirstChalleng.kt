fun main (args: Array<String>){
    val name = "Madrigal"
    val healthPoints = 100
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()

    //Aura
    val auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        else -> "green"
    }

    val healthStatus = when (healthPoints) {
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
    //Состояние игрока


    println( (if (auraVisible) "(Aura: $auraColor) " else "") +
            "(Blassed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}