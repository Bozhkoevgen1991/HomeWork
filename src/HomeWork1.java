import java.util.Scanner;


public class HomeWork1 {
    static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Введите возраст");
        int age = scanner.nextInt();


        if (age >= 0 && age  < 120) {
            if (age > 0 && age <= 12) {
                System.out.println("child");
            } else if (age >= 13 && age <= 17) {
                System.out.println("teen");
            } else if (age >= 18 && age <= 64) {
                System.out.println("adult");
            } else if (age >= 65) {
                System.out.println("senior");
            }
        } else {
            System.out.println("invalid");
        }
        //Подсчёт заглавных букв
        //Ввод: строка (латиница).
        //Вывод: количество символов 'A'..'Z'.
        //Подсказки: for по индексам, Character.isUpperCase.
        String upSimbol = new String("oloLoL");
        int simbol = 0;
        for (int i = 0; upSimbol.length() > i; i++) {
            char ch = upSimbol.charAt(i);
            if (Character.isUpperCase(ch)) {
                simbol ++;
            }

        }
        System.out.println("Количество символов " + simbol);

        //Простой тариф с надбавками
        //Ввод: base (цена, целое ≥0) и два флага: isWeekend (0/1), isHoliday (0/1).
        //Правила:
        //
        //В выходные +10% к цене.
        //
        //В праздничный день +20%.
        //
        //Если оба сразу — применяется обе надбавки по очереди.
        //Вывод: итоговая целая цена (округлять вниз).

        /*Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ввелите цену: ");
        int basePrise = scanner.nextInt();

        int isWickend = 1;
        int isHoliday = 1;
        double finalPrice = basePrise;

        if (isHoliday == 1 && isWickend == 1) {
            finalPrice = (basePrise * 1.10) * 1.20;
            System.out.println("Если выходной выпал на будни, то цена " + finalPrice);
        } else if (isWickend == 1) {
            finalPrice = finalPrice * 1.10;
            System.out.println("Цена в выходные " + finalPrice);
        } else if (isHoliday == 1) {
            finalPrice = finalPrice * 1.20;
            System.out.println("Цена в будни " + finalPrice);
        } else {
            System.out.println("Вы не выбрали день ");
        }*/


        /*Поиск максимума из M чисел
        //Ввод: целое M (≥1), затем M целых.
        //Вывод: максимальное из введённых чисел.
        //Подсказки: инициализируй max первым числом; for для оставшихся.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел М ");
        int num = scan.nextInt();
        if (num  >= 0) {
            System.out.println("Количество чисел должно быть больше или равно 1");
        } else {
            System.out.println("Вы ввели отрицательное число ");
            num = num = 0;
        } System.out.println("Введите первое число ");
        int maxNum = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Введите следующее число ");
            int currentNum = scanner.nextInt();

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }

        }
        System.out.println("Максимальное из введённых чисел - " + maxNum);*/
        /*int n = -1; // Число
        int sum = 0; // Сюда записываем количество цифр из цикла

        if (n <= 0) { // Цикл проверяет что число n не ниже нуля
            System.out.println( "Вы ввели не верное число");
        } else {
            for (int i = 0; n > 0; i++) {// Цикл крутит пока n не ниже 0
                n = n / 10; // Делим на 10,
                sum++;

            }
            System.out.println("Вывод " + sum);
        }*/
        /*int nums = 0;
        int sums = 0;

        if (nums >= 0) {
            System.out.println("Введите положительное число ");
        do {
            nums = scanner.nextInt();
            sums = nums + sums;
            System.out.println("Введите ещё одно число ");
         } while (nums != 0);
        System.out.println("Сумма введенных чисел " + sums);
        } else {
            System.out.println("Вы ввели отрицательное число");
        }*/

        /*System.out.println("Введите первое число ");
        int n1 = scanner.nextInt();
        System.out.println("Введите второе число ");
        int n2 = scanner.nextInt();
        int finAll = 1;


        if (n1 >= 1 && n2 >= 1) {
            for (int i = 1; i <= n2; i++) {
                finAll = finAll * n1;
                System.out.println(n1 + " " + "В степени " + i + " = " + finAll);
            }
        } else {
            System.out.println("Вы ввели отрицательное число ");
        }


        Мини-меню
        Ввод: многократно числа 1..3 — команды:
        1 — прибавить 1 к счётчику,
        2 — вычесть 1,
                3 — вывести текущее значение и завершить.
                Стартовое значение счётчика = 0.
        Вывод: итоговое значение после команды 3.
        Подсказки: while с чтением команды; if; break.*/

        /*System.out.print("Введите число от 1 до 3: ");
        int number = scanner.nextInt();
        int sum = 0;

        if (number > 0) {
            while (number <= 3) {
                System.out.print("Введите число от 1 до 3: ");
                if (number == 1) {
                    sum = sum + 1;
                    number = scanner.nextInt();
                } else if (number == 2) {
                        sum = sum - 1;
                        number = scanner.nextInt();
                    } else if (number == 3) {
                        System.out.println("Текущее значение " + sum);
                        break;
                }
            }
        } else System.out.println("Вы ввели отрицательное число или 0");*/
        /* Таблица степеней
                Ввод: целое X и целое K (K≥1).
                Вывод: K строк вида: i и X^i (i от 1 до K).
                Подсказки: for; умножение на предыдущий результат вместо Math.pow (чтобы проще).

                Рисуем прямоугольник из звёзд (ПРОПУСТИТЬ)
        Ввод: H и W (высота и ширина, 1..50).
        Вывод: H строк по W звёзд в каждой.
                Подсказки: вложенный for; System.out.println / print.*/
        int number = 100;
        while (number >= 0) {
            System.out.println(number);
            number = number - 5;
        }

    }

}