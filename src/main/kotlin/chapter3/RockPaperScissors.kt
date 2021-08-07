package chapter3

/**
The rules: The game compares the two choices. If they are the same, the result is a draw.
 */

fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
}

//codeMagnets3
fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")

        val userInput = readLine()
        println("User input is - $userInput")
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) println("You must enter a valid choice.")
    }
    println("Loop Ended")
    return userChoice
}