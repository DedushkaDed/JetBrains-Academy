data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = when {
                value !in -92..57 && name == "Moscow" -> 5
                value !in -92..57 && name == "Hanoi" -> 20
                value !in -92..57 && name == "Dubai" -> 30
                else -> value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third
    when {
        firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees -> print(firstCity.name)
        secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees -> print(secondCity.name)
        thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees -> print(thirdCity.name)
        else -> print("neither")
    }
}