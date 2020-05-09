enum class DangerLevel(val level: String) {
    HIGH("3"),
    MEDIUM("2"),
    LOW("1");
    fun getLevel(): Int {
        return level.toInt()
    }
}

fun main() {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM
    println(high.getLevel() > medium.getLevel())
}
