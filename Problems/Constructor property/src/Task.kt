fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimerClass(timerValue)
    println(timer.time)
}

 class ByteTimerClass(var time: Int) {
    var time:Int = time

    set(value) {
        field = when {
            value < -128 -> value = -128

        }
    }
}


//    var time: Int = time
//        set(value) {
//            field = if (time < -128) {
//                time = -128
//            } else if (time > 127) {
//                time = 127
//            }
//            else { println("$time")}
//        }





//data class City(val name: String) {
//    var degrees: Int = 0
//        set(value) {
//            field = when {
//                value !in -92..57 && name == "Moscow" -> 5
//                value !in -92..57 && name == "Hanoi" -> 20
//                value !in -92..57 && name == "Dubai" -> 30
//                else -> value
//            }
//        }
//}