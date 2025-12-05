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

        System.out.println("Введите число равное дню недели от 0 до 6 ");
        Scanner scan = new Scanner(System.in);
        int dayEnter = scan.nextInt();
        int dela = 0;

        String[] dayWeek = new String[7];
        dayWeek[0] = "Понедельник";
        dayWeek[1] = "Вторник";
        dayWeek[2] = "Среда";
        dayWeek[3] = "Четверг";
        dayWeek[4] = "Пятница";
        dayWeek[5] = "Суббота";
        dayWeek[6] = "Воскресенье";

        String[] Work = new String[7];
        Work[0] = "Подъем";
        Work[1] = "Завтрак";
        Work[2] = "Работа";
        Work[3] = "Домой";
        Work[4] = "Тренировка";
        Work[5] = "Учёба";
        Work[6] = "Спать";

        String[] relax = new String[7];
        relax[0] = "Подъем";
        relax[1] = "Завтрак";
        relax[2] = "Гулять";
        relax[3] = "Обед";
        relax[4] = "Сериал";
        relax[5] = "Бухать";
        relax[6] = "Спать";

        if (dayEnter <= 5) {
            System.out.println("Будний день - " + dayWeek[dayEnter]);
            System.out.println("Список дел: ");
            for (int i = 0; i <= dayEnter; i++) {
                System.out.println(Work[i]);
            }
        } else if (dayEnter > 5 || dayEnter < 7) {
            System.out.println("Будний день - " + dayWeek[dayEnter]);
            System.out.println("Список дел: ");
            for (int i = 0; i <= dayEnter; i++) {
                System.out.println(relax[i]);
            }
        }
    }
}
