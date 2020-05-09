// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val nameOne = scanner.next().first()
    val surname = scanner.next()
    val age = scanner.nextInt()

    println("$nameOne. $surname, $age years old")
    // put your code here
}