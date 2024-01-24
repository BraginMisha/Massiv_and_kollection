class task1 {
}
fun main(args: Array<String>) {

    print("Введите колличество строк: ")
    var a = readLine()!!.toInt()
    print("Введите колличество столбцов: ")
    var b = readLine()!!.toInt()
    var c = 0;

    var arr: Array<Array<Int>> = Array(a){
        Array(b){
            (0 ..200).random()
        }
    }
    var kollNum = mutableSetOf<Char>()
    var strNum = " ";
    for(i in 0 .. a - 1){
        for (j in 0..b - 1){
            strNum = arr[i][j].toString()
            strNum.forEach { kollNum.add(it) }
            print(arr[i][j].toString() + "\t\t")
        }
        println();
    }

    kollNum.forEach{c++}
    print("В массиве использовано " + c + " различных цифр")
}