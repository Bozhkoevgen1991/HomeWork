//Задание № 1
public static void main(String [] arge) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = scanner.nextInt();
    if (n <= 0) {
        System.out.println("Не верное число");
    } else {
        for (int i = 1; i <= n; i++)
            System.out.print(" " + i);
    }

// Задание №2
//Чётное или нечётное
//Ввод: одно целое число.
//Вывод: Если четное, то вывод: "четное". Если не четное, то вывод "не четное".
//Подсказки: оператор %
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Введите число: ");
    int n1 = scanner1.nextInt();
    if (n1 % 2 == 0) {
        System.out.println(n1 + " - четное число");
    } else {
        System.out.println(n1 + " - не четное число");
    }
// 3.Сумма кратных 3 или 5
//Ввод: целое N (>=1).
//Вывод: сумма всех чисел от 1 до N, которые кратны 3 или 5.
//Подсказки: %, for/while.
    Scanner scanner2 = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n3 = scanner2.nextInt();
    int sum = 0;
    if (n3 >= 1) {
        for (int i1 = 1; i1 <= n3; i1++) {
            if (i1 % 3 == 0 || i1 % 5 == 0)
                sum += i1;
        }
                System.out.println("Сумма кратных 3 и 5: " + sum);


    }
        //4 Количество цифр и сумма цифр
        //Ввод: целое (может быть отрицательным).
        //Вывод: две величины — сколько в нём цифр и сумма его цифр (знак не учитывать).
        //Подсказки: Math.abs, %, /, while.

    Scanner scanner3 = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n4 = scanner3.nextInt();
    String nStr = String.valueOf(n4);
    int number = nStr.length();
    System.out.println(nStr.length()); // Количество цифр в числе
    int summa = 0;
    for (char s : nStr.toCharArray()) {
        summa += s - '0';}
        System.out.println(summa);


// 5 Переворот числа
//Ввод: целое число (может быть отрицательным).
//Вывод: число с цифрами в обратном порядке, знак сохранить.
//Подсказки: Math.abs,%,/,while.
    Scanner scanner4 = new Scanner(System.in); // Вызываем ввод данных в консоль
    System.out.println("Введите число: ");              // вводим число
    int numb = scanner4.nextInt();                      // запоминаем число как numb(123)
    numb = Math.abs(numb);                              //Переворачиваем
    int rev = 0;                                         // 0 для возврата числа после деления %10
    int minus = 1;
    if(numb < 0){
        minus = -1;
    }
    while (numb <= 0){                                          //запускаем цикл пока число не станет равно 0
        int digit = numb % 10;                                  // делим на 10 с остатком 3, остается 12
        rev = rev * 10 + digit;                                 // 0*10 = 0 + 3 из деления выше
        numb = numb / 10;                                        // не помню для чего делим
    }
    System.out.println((numb + rev) * minus);


    }