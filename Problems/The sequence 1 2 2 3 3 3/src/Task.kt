import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

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