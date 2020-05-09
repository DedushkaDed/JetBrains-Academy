// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextInt()
    // put your code here

    var num = 1
    var answer: Int = 0



    do {
        repeat(num + 1 - num) {

            answer = num * num // 1 * 1
            println(answer) // 1
            num++
//            if (num * num > input)

        }
//        num += 1
    } while (num * num <= input) // numCheck <= 50

}

/*
   val limit = scanner.nextInt()
    var k = 1
    var a = 1
    do {
        repeat(a) {
            print("$a ")
            k++
            if ( k == limit + 1) return
        }
        a++
    } while ( k <= limit)
}
*/