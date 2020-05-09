// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // a + b, a + c, b + c >= 20

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val min = 20

    val inRange = a + b == min || a + c == min || b + c == min
    println(inRange)
}