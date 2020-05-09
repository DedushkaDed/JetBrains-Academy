// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val input = scanner.nextInt()

    if (input < 10) {
        println("true")
    }
    else {
        println("false")
    }
}