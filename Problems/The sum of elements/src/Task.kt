// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var max = 0

    do {
        val num = scanner.nextInt()
        if (num == 0) break
        if (num != 0) max += num
    } while (true)

    print(max)


    /*
        var max = scanner.nextInt()

    do {
        val num = scanner.nextInt()
        if (num == 0) break
        if (max < num) max = num
    } while (true)

    print(max)
}
     */
}