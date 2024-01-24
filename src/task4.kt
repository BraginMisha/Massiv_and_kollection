class task4 {
}
/*Создать приложение, в котором пользователь дает на вход два числовых массива,
числа в массиве могут повторяться. На выходе приложение выдает пересечение этих массивов.
Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2].
На выходе должны получить [1, 2, 2, 3]. То есть учитывается количество повторений чисел в массиве.
Число 2 в одном массиве повторялось два раза, в другом - три.
Значит в итоговом массиве число два должно быть два раза*/

fun main() {
    print("Введите элементы первого массива через пробел: ")
    val input1 = readLine()
    val array1 = input1?.split(" ")?.map { it.toInt() } ?: emptyList()

    print("Введите элементы второго массива через пробел: ")
    val input2 = readLine()
    val array2 = input2?.split(" ")?.map { it.toInt() } ?: emptyList()

    // пересечение массивов
    val intersection = mutableListOf<Int>()
    val arrCount1 = array1.groupingBy { it }.eachCount()
    val arrCount2 = array2.groupingBy { it }.eachCount()

    for (element in arrCount1.keys) {
        val freq1 = arrCount1[element] ?: 0
        val freq2 = arrCount2[element] ?: 0
        for (i in 0 until minOf(freq1, freq2)) {
            intersection.add(element)
        }
    }
    println("Пересечение массивов: $intersection")
}