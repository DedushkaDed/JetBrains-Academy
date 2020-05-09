fun main() {
    val input = readLine()!!
    // write code here

    if (input.isEmpty()){
        println(input)
    }
    else {
        when {
            input.first() == 'i' -> {
                var newInput = input.drop(1).toInt()
                newInput += 1
                println(newInput)
            }
            input.first() == 's' -> {
                var newInput = input.drop(1)
                println(newInput.reversed())

            }
            else -> {
                println(input)
            }
        }
    }
}