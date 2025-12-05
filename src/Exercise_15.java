import java.util.Scanner;

public class Exercise_15 {

    public static void main(String [] arge) {
        /*Задача №1 (if)
        Знак числа
        Ввод: одно целое число.
        Вывод: "positive", "negative" или "zero".
        Подсказки: цепочка if / else if / else.*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if(num > 0) {
            System.out.println("Positive " );
        } else if (num < 0) {
            System.out.println("Negative " );
        }else if (num == 0){
            System.out.print("Zero");
        }else {
            System.out.println("Вы ввели что то не так");
        }
/*Задача №2 (if)
Минимум из двух
Ввод: два целых числа.
Вывод: меньшее из них (само число).
Подсказки: if и присваивание.
 */
       /* Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int scan1 = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int scan2 = scanner.nextInt();

        if (scan1 > scan2){
            System.out.println("Первое число больше");
        } else if (scan1 < scan2) {
            System.out.println("Второе число больше");
        } else if (scan1 == scan2) {
            System.out.println("Числа ровны");

        }
        /*Задача №1 (for)
    Cумма 1..N
Ввод: целое N (≥1).
Вывод: сумма чисел от 1 до N.
Подсказки: цикл for и счётчик sum.*/

        /* Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int scan3 = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= scan3; i ++){
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + scan3 + " = " + sum);

         */

// Задача №3 (if)
// Попал в диапазон
//Ввод: одно целое N и границы L, R (L ≤ R).
//Вывод: "inside" если L ≤ N ≤ R, иначе "outside".
//Подсказки: логические операции &&, ||.
        /*int N = 18;
        int L = 8;
        int R = 2;

        if (L >= R) {
            System.out.println("Вы ввели верные значения");
        }else if (N <= R && N >= L) {
                System.out.println("Inside");
            } else {
                System.out.println("Outsude");
            }
        }
        //Задача №4 (if)
        //Категория возраста
        //Ввод: целое age (0..120).
        //Вывод: "child" (0–12), "teen" (13–17), "adult" (18–64), "senior" (65+). Если вне диапазона — "invalid".
        //Подсказки: каскад if-else; аккуратные границы.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        if (age >= 0 && age <= 12) {
            System.out.println("child");
        }else if (age >= 13 && age <= 17) {
                System.out.println("teen");
        }else if (age >= 18 && age <= 64) {
            System.out.println("adult");
        } else if (age <= 65) {
            System.out.println("senior");
        } else {
            System.out.println("invalid");
        }


    }

*/
}
}
