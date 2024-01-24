class task2 {
}
/*Имеется массив целых чисел из 5-и строк и 5-и столбцов.
Выяснить, симметричен ли он относительно главной диагонали.
То есть - элемент 1,2 равен элементу 2,1. Элемент 1,3 равен элементу 3,1 и т.д. Например массив
5  9  6  7  2
9  8  4  5  3
6  4  3  8  7
7  5  8  4  8
2  3  7  8  1
является симметричным относительно главной диагонали*/

fun main() {
    val array = arrayOf(
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(9, 8, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )

    val rows = array.size
    val cols = array.size

    var isSymmetric = true

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (array[i][j] != array[j][i]) {
                isSymmetric = false
                break
            }
        }
    }

    println("Массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${array[i][j]} ")
        }
        println()
    }

    if (isSymmetric) {
        println("Массив является симметричным относительно главной диагонали.")
    } else {
        println("Массив не является симметричным относительно главной диагонали.")
    }
}