import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    // (−15,12]∪(14,17)∪[19,+∞)
    // от -14 до 12 включая || 15 и 16 || от 19 до бесконечности (input > 19)
    if (input in -14..12){
        println("True")
    }
    else if (input in 15..16) {
        println("True")
    }
    else if (input >= 19){
        println("True")
    }
    else {
        println("False")
    }
}
