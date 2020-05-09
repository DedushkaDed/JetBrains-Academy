// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val item1 = scanner.next() // 862 -> 2 6 8

    val a = item1[0].toString()
    val b = item1[1].toString()
    val c = item1[2].toString()

    val answ = c+ b + a
    println(answ)

}


