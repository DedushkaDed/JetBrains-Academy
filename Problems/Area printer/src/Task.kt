import java.awt.Rectangle

fun printArea(rectangle: Rectangle) {
    // ...

    var classObjectRectangle = rectangle()

    sumMoya(classObjectRectangle)




}

fun sumMoya (obj: Rectangle){
    var summa = obj.width * obj.height
    println(summa)
}