import java.util.Scanner

enum class Rainbow (color: String) {
    RED ("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    CYAN("cyan"),
    AZURE("azure"),
    INDIGO("indigo"),
    BLUE("blue"),
    PURPLE("purple"),
    VIOLET("violet");

}

fun findColor (color: String): Boolean {
    for(enum in Rainbow.values()){
        if (color.toUpperCase() == enum.name) return true
    }
    return false
}




fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val thisColor = input.next()
    println(findColor(thisColor))
}