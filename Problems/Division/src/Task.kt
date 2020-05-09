// Posted from EduTools plugin
import java.util.*

// write your code here

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    divide(a.toDouble(),b.toDouble())
}

fun divide(a: Double, b: Double):Any {
    val answer = a /  b
    return println(answer) // 2.5
}
