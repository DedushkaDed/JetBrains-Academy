import java.util.Scanner

enum class WorldStates (val currencyOfState: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar");
}

fun checkCountry (countryOne: String, countrySecond: String): Boolean {
    for (enum in WorldStates.values()) {
        if (countryOne == enum.name || countrySecond == enum.name) {
                if (WorldStates.valueOf(countryOne).currencyOfState == WorldStates.valueOf(countrySecond).currencyOfState) {
                    return true
                }
            return false
        }
        return false
    }
    return false
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val inputOne = input.next().toUpperCase()
    val inputTwo = input.next().toUpperCase()

    println(checkCountry(inputOne,inputTwo))
}