// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // between 10 and 20 - not weekend
    // 15 25 - weekend

    val cups = scanner.nextInt()
    val weekend = scanner.nextBoolean()
    var party:Boolean = true

    if(weekend && (cups >= 15) && (cups <= 25)) {
        println(party)
    }

    else if (!weekend && (cups >= 10) && (cups <= 20)) {
        println(party)
    }

    else {
     party = false
    println(party)
    }

    }

