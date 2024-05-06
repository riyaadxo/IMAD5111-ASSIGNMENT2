import kotlin.random.Random

class Tamagotchi(var name: String) {
    var hunger: Int = 0
    var cleanliness: Int = 0
    var happiness: Int = 0

    init {
        println("$name has been born!")
    }

    fun feed() {
        hunger -= Random.nextInt(5, 10)
        happiness += Random.nextInt(1, 5)
        println("$name has been fed.")
    }

    fun clean() {
        cleanliness += Random.nextInt(5, 10)
        happiness += Random.nextInt(1, 5)
        println("$name has been cleaned.")
    }

    fun play() {
        hunger += Random.nextInt(1, 5)
        cleanliness -= Random.nextInt(5, 10)
        happiness += Random.nextInt(5, 10)
        println("$name is happy playing.")
    }

    fun status() {
        println("Status of $name:")
        println("Hunger: $hunger")
        println("Cleanliness: $cleanliness")
        println("Happiness: $happiness")
    }
}

fun main() {
    println("Welcome to Tamagotchi!")
    println("Enter your Tamagotchi's name:")
    val name = readLine() ?: "Tamagotchi"

    val tamagotchi = Tamagotchi(name)

    var isRunning = true
    while (isRunning) {
        println("Choose an action:")
        println("1. Feed")
        println("2. Clean")
        println("3. Play")
        println("4. Status")
        println("5. Quit")

        when (readLine()?.toIntOrNull()) {
            1 -> tamagotchi.feed()
            2 -> tamagotchi.clean()
            3 -> tamagotchi.play()
            4 -> tamagotchi.status()
            5 -> {
                println("Goodbye!")
                isRunning = false
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}
