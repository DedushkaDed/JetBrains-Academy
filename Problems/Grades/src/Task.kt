// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    val checks = IntArray(n) { scanner.nextInt() }

    // Numbers represent grades this way: 2 is "D", 3 is "C", 4 is "B", and 5 is "A".
    // output: D C B A

    var D = checks.count { it == 2 }
    var C = checks.count { it == 3 }
    var B = checks.count{ it == 4 }
    var A = checks.count {it == 5}

    println("$D $C $B $A")

}