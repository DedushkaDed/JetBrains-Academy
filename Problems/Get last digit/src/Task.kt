// Posted from EduTools plugin
import java.util.*

// write your code here
fun getLastDigit (num1:Int):Int {
    return (Math.abs(num1) % 10) //  Остаток от деления на 10 ->  Math.abs - убирает отрицательные значения
   // return num1 % 10 // Заданное число делим на 10 (остаток от деления = последний символ) (Только для положительных чисел)
}
/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}

