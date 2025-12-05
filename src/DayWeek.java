import javax.swing.*;
import java.util.Scanner;

public class DayWeek {
    static void main(String[] args) {

       /* 4.Планировщик занятий по дням недели
        Вход: одно целое число от 1 до 7 — номер дня недели.
        Выход: текстовое описание плана на день, при этом:
        рабочие дни (например, 1–5) должны давать один тип текста;
        выходные (6–7) — другой;
        если число не в диапазоне 1–7 — отдельное сообщение об ошибке.
        При корректном дне ещё нужно вывести, сколько дней осталось до воскресенья (например, если считать, что 7 — воскресенье).
        Пример: вход 3 → вывод может быть: «Будний день: учёба/работа» и «До воскресенья осталось 4 дня» */

        System.out.println("Введите число равное дню недели от 1 до 7 ");
        Scanner scan = new Scanner(System.in);
        int dayEnter = scan.nextInt();
        int process = 7;

        String[] dayWeek = new String[8];
        dayWeek[0] = "";
        dayWeek[1] = "Понедельник";
        dayWeek[2] = "Вторник";
        dayWeek[3] = "Среда";
        dayWeek[4] = "Четверг";
        dayWeek[5] = "Пятница";
        dayWeek[6] = "Суббота";
        dayWeek[7] = "Воскресенье";

        String[] Work = new String[8];
        Work[0] = "";
        Work[1] = "Подъем";
        Work[2] = "Завтрак";
        Work[3] = "Работа";
        Work[4] = "Домой";
        Work[5] = "Тренировка";
        Work[6] = "Учёба";
        Work[7] = "Спать";

        String[] relax = new String[8];
        relax[0] = "";
        relax[1] = "Подъем";
        relax[2] = "Завтрак";
        relax[3] = "Гулять";
        relax[4] = "Обед";
        relax[5] = "Сериал";
        relax[6] = "Бухать";
        relax[7] = "Спать";

        if (dayEnter > 0) {
            if (dayEnter < 5) {
                System.out.println("Будний день - " + dayWeek[dayEnter]);
                System.out.println("Список дел: ");
                for (int i = 0; i <= process; i++) {
                    System.out.println(Work[i]);
                }
            } else if (dayEnter >= 5) {
                System.out.println("Выходной день - " + dayWeek[dayEnter]);
                System.out.println("Список дел: ");
                for (int i = 0; i <= process; i++) {
                    System.out.println(relax[i]);
                }
            }
        } else {
            System.out.println("Вы ввели не корректное число ");
        }
    }
}
