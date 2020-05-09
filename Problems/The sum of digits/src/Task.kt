// Posted from EduTools plugin
import java.util.Scanner

fun sumOfDigits(number: Int): Int {
    return number / 100 + number % 100 / 10 + number % 100 % 10
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print(sumOfDigits(scanner.nextInt()))
}