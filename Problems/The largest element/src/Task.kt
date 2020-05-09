// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var max = scanner.nextInt()

    do {
        val num = scanner.nextInt()
        if (num == 0) break
        if (max < num) max = num
    } while (true)

    print(max)


}











//    while (num != 0) {
//        if (num > i) {
//            i = num
//            num = scanner.nextInt()
//        } else {
//            num = scanner.nextInt()
//        }
//
//    }
