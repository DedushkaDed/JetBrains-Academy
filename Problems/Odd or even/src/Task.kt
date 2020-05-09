// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextInt()

    // EVEN -четное ODD -нечетное

    if (input % 2 == 0) {
        println("EVEN")
    }
    else{
        println("ODD")
    }
}