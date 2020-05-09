// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val inputString = scanner.nextLine()
    val num = scanner.nextInt()

    println("Symbol # $num of the string \"$inputString\" is '${inputString[num -1]}' ")

    // write your code here
}