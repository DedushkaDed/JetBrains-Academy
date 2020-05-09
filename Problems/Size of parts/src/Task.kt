// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val allComponents = scanner.nextInt()

    var detailsPerfect = 0
    var detailsLarger = 0
    var detailsSmaller = 0

    // larger = 1 1
    // smaller = -1 5
    // perfect = 0 4

    //           (perfect)      (larger)        (smaller)
    // Output : (ready parts) (parts to fix) (rejected)

    repeat(allComponents) {
        val detail = scanner.nextInt()
        if (detail != 0)
        {
            if (detail == 1) {
                detailsLarger += 1 // Large
            }
            if (detail == -1) {
                detailsSmaller += 1 // Smaller
            }
        }
        else {
            detailsPerfect += 1
        }
    }

    println("$detailsPerfect $detailsLarger $detailsSmaller")
}