// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(otvet(a,b,c))
}

fun otvet (numA:Int, numB: Int, numC:Int):Boolean{
    return numA in numB..numC
}