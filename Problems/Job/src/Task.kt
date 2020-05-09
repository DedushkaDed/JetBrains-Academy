// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextInt()

    // val within = input in 18..59
    println(otvet(input))

}

fun otvet (num1:Int):Boolean {
    return num1 in 18..59
}