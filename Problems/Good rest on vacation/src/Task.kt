// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val days = scanner.nextInt() // duration in days
    val food = scanner.nextInt()  // total food cost per day
    val flight = scanner.nextInt() // one-way flight cost (2)
    val nights = scanner.nextInt() // cost of one night in a hotel -1 (the number of nights equal duration minus one)

    // days * food = money
    var money = days * food // 7*30
    // + flight cost
    money += flight * 2
    // cost for the nights ( number of days -1)
    money += nights * (days-1) // money = 40* (7-1)

    println(money)

}