// Posted from EduTools plugin
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val hour1 = scanner.nextInt()
    val min1 = scanner.nextInt()
    val sec1 = scanner.nextInt()
    val hour2 = scanner.nextInt()
    val min2 = scanner.nextInt()
    val sec2 = scanner.nextInt()
    // 2.h.2m.2c -> 1h.1m.1sec => 1h.1m.1c => 3600 + 60 + 1

    var anHour = hour2 - hour1 // 1h
    var anMin = min2 - min1 // 1m
    var anSec = sec2 - sec1 // 1c

    anHour *= 3600 // 3600
    anMin *= 60 // 60
    anSec *= 1 // 1

    val answ1 = anHour + anMin + anSec
    println(answ1)
}
