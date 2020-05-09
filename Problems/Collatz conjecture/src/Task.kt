// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {

    /*
    Если n-четное число, разделите его пополам,
     если нечетное-умножьте на 3 и сложите 1.
     Повторяйте эту операцию до тех пор, пока мы не получим число 1 в результате.
     Например, если число n = 17, то последовательность выглядит так:
*/

    val scanner = Scanner(System.`in`)

    var num = scanner.nextInt()

    while (num != 1){
        if (num % 2 == 0){
            num /= 2
        } else {
            num * 3 + 1
        }
        println("$num ")
    }
}