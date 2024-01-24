class task5 {
}
fun main(args: Array<String>)
{
    print("Введите через запятую слова: ");
    var str = readln().split(",");
    var st1 = "";
    var st2 = "";
    var n = 0;
    var massForSort = arrayOf<Int>();
    var flug = false;
    var countMass = 1;
    var indexStartWord = 0;
    massForSort += 0;
    while (massForSort.size != str.size + n)
    {
        st1 = str[indexStartWord];
        st2 = str[countMass];
        if (indexStartWord==countMass)
        {
            countMass++;
            continue;
        };
        //Проверка схожести слов
        for(it1 in st1)
        {
            flug = false;
            for(it2 in st2)
            {
                if(it1 == it2) flug = true;
            }
            if(!flug) break;

        }
        if(flug) massForSort += countMass;

        //Поиск индекса, который еще не использовался
        if(countMass == str.size - 1)
        {

            for(it in massForSort)
            {
                for(it in massForSort)
                {
                    if(indexStartWord == it) flug = true;
                }
                if(!flug) break;
                indexStartWord++;
                flug = false;
            }

            countMass=-1;
            massForSort += -1;
            massForSort += indexStartWord;
            n++;

            if(indexStartWord == str.size-1)
            {
                massForSort += -1;
                n++;
                break;
            }
        }
        countMass++;
    }
    for (it in massForSort)
    {
        if(it == -1)
        {
            println();
            continue;
        }
        print("${str[it]} ");
    }
}