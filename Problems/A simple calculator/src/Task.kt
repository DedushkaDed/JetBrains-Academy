// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // "first number" "operation" "second number"
    // the first - long
    // second - operator (+ - / *)
    // the num2 - long

    val num1 = scanner.nextLong()
    val operation = scanner.next() // + - * /
    val num2 = scanner.nextLong()

    val zero:Long = 0
    var vseok = 0

    // If a user performs the division and the second number is 0, output the line "Division by 0!".

    // If the input operator is not in the listed, output "Unknown operator".

    if (num2 == zero) {
        println("Division by 0!")
        vseok += 2
    }

while ( vseok == 0) {
    when (operation) {
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "/" -> println(num1 / num2)
        "*" -> println(num1 * num2)

        else -> {
            println("Unknown operator")
        }
    }
    vseok +=1
}

}
