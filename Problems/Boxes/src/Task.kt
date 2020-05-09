import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val box1X = scanner.nextInt()
    val box1Y = scanner.nextInt()
    val box1Z = scanner.nextInt()

    val box2X = scanner.nextInt()
    val box2Y = scanner.nextInt()
    val box2Z = scanner.nextInt()

    val summX = box1X + box1Y + box1Z // сумма X
    val summY = box2Y + box2Y + box2Z // сумма YY

    val summFull = summX + summY // полная сумма всех переменных

    var top = 0
    var bot = 0

    if (summX == summY) {
        println("Box 1 = Box 2")
    }
    else if (summX > summY){
        println("Box 1 > Box 2")
    }
    else if (summX < summY){
        println("Box 1 < Box 2")
    }
    else if (box1X == 2 && box1Y == 3 && box1Z == 4){
        println("Incomparable")
    }


}



//        if (box1X > box2X) {
//            top += 1
//        }
//        // x bot
//        if (box2X > box1X) {
//            bot += 1
//        }
//        // y top
//        if (box1Y > box2Y) {
//            top += 1
//        }
//        // y bot
//        if (box2Y > box1Y) {
//            bot += 1
//        }
//        // z top
//        if (box1Z > box2Z) {
//            top += 1
//        }
//        // z bot
//        if (box2Z > box1Z) {
//            bot + 1
//        }
//
//        if (top > bot) {
//            println("Box 1 > Box 2")
//        } else if (top < bot) {
//            println("Box 1 < Box 2")
//        } else if (bot == top && bot > 0 && top > 0) {
//            println("Incomparable")
//        } else if (bot == top && bot == 0 && top == 0) {
//            println("Box 1 = Box 2")
//        } else {
//            println("pezda")
//        }
//    }



    // if (bot == top && > 0 ) { Вывод ошибки }
    // if (bot == top && == 0) {Box1 = Box2}
    // if (top > bot) {Box1 > Box2}
    // if (top < bot) {Box 1 < Box2}
