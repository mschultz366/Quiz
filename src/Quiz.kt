// Program questions user
//User enters input
// Program tells user right or wrong
//Program tells user how many they got correct
fun main() {

    var wrongAnswers = 0

    println("\t\t\t\t -- Disney Quiz -- ")
    println("______ is the name of the crab from the little mermaid?")
    println("The mouse from Aristocats is named ________.")
    println("The witch named ________ is the villain in Sleeping Beauty.")
    println("_________ wants to kill Mowgli in The Jungle Book.")
    println("There is a caterpillar in Bugs Life named ___________")

    print("\n1. ")
    val one = readLine()!!.toString()
    if (!one.equals("Sebastian", ignoreCase = true)) {
        print("WRONG!\n")
        wrongAnswers += 1
    } else {
        print("That is correct...\n")
    }

    print("2. ")
    val two = readLine()!!.toString()
    if (!two.equals("Roquefort", ignoreCase = true)) {
        print("WRONG!\n")
        wrongAnswers += 1
    } else {
        print("That is correct...\n")
    }

    print("3. ")
    val three = readLine()!!.toString()
    if (!three.equals("Maleficent", ignoreCase = true)) {
        print("WRONG!\n")
        wrongAnswers += 1
    } else {
        print("That is correct...\n")
    }

    print("4. ")
    val four = readLine()!!.toString()
    if (!four.equals("Shere Khan", ignoreCase = true)) {
        print("WRONG!\n")
        wrongAnswers += 1
    } else {
        print("That is correct...\n")
    }

    print("5. ")
    val five = readLine()!!.toString()
    if (!five.equals("Heimlich", ignoreCase = true)) {
        print("WRONG!\n")
        wrongAnswers += 1
    } else {
        print("That is correct...\n")
    }

    print("Your total score was: ")
    when (wrongAnswers) {
        0 -> print("${5 - wrongAnswers}, Disney nerd.")
        1 -> print("${5 - wrongAnswers}, close!")
        2 -> print("${5 - wrongAnswers}, not quite.")
        3 -> print("${5 - wrongAnswers}, oof!")
        4 -> print("${5 - wrongAnswers}, that's no good...")
        5 -> print("${5 - wrongAnswers}, terrible! Oof!")
    }

}