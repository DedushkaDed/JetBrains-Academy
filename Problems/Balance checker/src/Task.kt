import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var hasMoney = scanner.nextInt()

    val shop1 = scanner.nextInt()
    val shop2 = scanner.nextInt()
    var shop3: Int = 0
    if (scanner.hasNextInt()){
        shop3 = scanner.nextInt()
    }


    var shopSumm = shop1 + shop2 + shop3


    // Если покупка - больше чем всего денег
    if (shopSumm > hasMoney ) {

        // Если денег больше чем 1 покупка - Вычитаем из своих денег эту покупку
        if  (hasMoney >= shop1){
            hasMoney -= shop1
        }
        else{
            shopSumm = shop1
        }
        // Если денег больше чем 2 покупка - Вычитаем из своих денег эту покупку
        if (hasMoney >= shop2){
            hasMoney -= shop2
        }
        else {
            shopSumm = shop2
        }
        // Если денег больше чем 3 покупка - Вычитаем из своих денег эту покупку
        if (hasMoney >= shop3){
            hasMoney -= shop3
        }
        else {
            shopSumm = shop3
        }

        println("Error, insufficient funds for the purchase. You have $hasMoney, but you need $shopSumm.")
    }
    // Если ТВОИХ ДЕНЕГ - больше или СТОЛЬКО ЖЕ - сколько и покупка.
    else if (hasMoney >= shopSumm) {
        hasMoney -= shopSumm
        println("Thank you for choosing us to manage your account! You have $hasMoney money.")
    }
}
