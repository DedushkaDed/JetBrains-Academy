// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here

    val per1 = scanner.next().first()
    val ot0do9 = per1 in '\u0031'..'\u0039' // If the input is a digit '0', '1', '2', ..., '9' (without quotes), the program prints true. Otherwise, it prints false.

    if (per1.isLetter())
    {
        if (per1.isUpperCase()) {
            println(per1.isUpperCase())
        }
    }

    if (per1.isDigit() && ot0do9){
        println(ot0do9)
    }

}