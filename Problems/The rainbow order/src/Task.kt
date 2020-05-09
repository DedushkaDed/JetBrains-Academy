import java.util.Scanner

enum class Rainbow (val pos: Int) {
    RED (1),
    ORANGE(2),
    YELLOW(3),
    GREEN(4),
    BLUE(5),
    INDIGO(6),
    VIOLET(7);
}

fun findPosition (color: String): Int {
    for (enum in Rainbow.values()) {
        if (color.toUpperCase() == enum.name) return enum.pos
    }
    return 0
}

fun main (args: Array<String>) {
    val input = Scanner(System.`in`)
    val thisColor = input.next()
    println(findPosition(thisColor))
}
