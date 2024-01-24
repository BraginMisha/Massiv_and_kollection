class task3 {
}
fun main(args: Array<String>)
{
    var countTxt = 0;
    var num = 0;
    var countKye = 0;
    var enterTxt = "";
    val alph = mapOf(
        'А' to 21,'Б' to 13,'В' to 4,'Г' to 20,'Д' to 22,'Е' to 1,'Ё' to 25,'Ж' to 12,'З' to 24,
        'И' to 14,'Й' to 2,'К' to 28,'Л' to 9,'М' to 23,'Н' to 3,'О' to 29,'П' to 6,'Р' to 16,
        'С' to 15,'Т' to 11,'У' to 26,'Ф' to 5,'Х' to 30,'Ц' to 27,'Ч' to 8,'Ш' to 18,'Щ' to 10,
        'Ь' to 33,'Ы' to 31,'Ъ' to 32,'Э' to 19,'Ю' to 7, 'Я' to 17);

    print("Выбор режима работы (1 - шифр, 2 - дешифр): ");
    var a = readLine()!!.toInt();
    println();
    if(a == 1){
        print("Введите ключевое слово: ");
        var key = readln();
        key = key.uppercase();
        print("Введите исходный текст: ");
        var txt = readln();
        txt = txt.uppercase();

        while (countTxt != txt.length)
        {
            if(countKye == key.length)
            {
                countKye = 0
            };
            num = (alph.get(txt[countTxt]))!! +(alph.get(key[countKye]))!!;
            if(num > 33) num -= 33;
            alph.keys.forEach()
            {
                if(num == alph[it])
                {
                    enterTxt += it;
                }

            }
            countTxt++;
            countKye++;

        }
        print("Зашифрованный текст: ${enterTxt}");
    }
    if(a == 2)
    {
        print("Введите ключевое слово: ");
        var key = readln();
        key = key.uppercase();
        print("Введите зашифрованный текст: ");
        var txt = readln();
        txt = txt.uppercase();

        while (countTxt != txt.length)
        {
            if(countKye == key.length)
            {
                countKye = 0
            };
            num = (alph.get(txt[countTxt]))!! - (alph.get(key[countKye]))!!;
            if(num < 0) num += 33;
            alph.keys.forEach()
            {
                if(num == alph[it])
                {
                    enterTxt += it;
                }

            }
            countTxt++;
            countKye++;

        }
        print("Исходный текст: ${enterTxt}");
    }

}