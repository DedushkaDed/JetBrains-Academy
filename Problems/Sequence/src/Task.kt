// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.next().first().isDigit()
    val b = scanner.next().first().isDigit()
    val c = scanner.next().first().isDigit()
    val answer= true

    if (a < b && b < c) {
        println(answer)
    }
}