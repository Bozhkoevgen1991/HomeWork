import java.util.Scanner;

public class HomeWork_Array {
    static void main(String[] args) {
        /*1. Статистика шагов за неделю
Вход: целочисленный массив из 7 элементов — количество шагов за каждый день недели (начиная, например, с понедельника).​
Выход:
общее количество шагов за неделю;
среднее количество шагов за день (целое число);
номер дня (или название), в который было сделано максимальное количество шагов.
Пример: вход: [3500, 8000, 12000, 4000, 10000, 7000, 5000] →
сумма: 49500;
среднее: 7071 (если делить целочисленно);
максимальный день — 3‑й (12000 шагов).*/
/*
        int[] daySteps = {1_200, 1_400, 2_300, 3_400, 1_600, 1_850, 1_234};
        int sum = 0;
        int average = 0;
        int maxSteps = 0;
        int maxDay = 0;

        String[] day = new String[7];
        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";
        for (int x : daySteps) {
            sum = sum + x;
        }
        System.out.println("Сумма шагов за неделю - " + sum + " шага");

        average = sum / 2;
        System.out.println("Среднее количество шагов - " + average);

        for (int i = 0; i < daySteps.length; i++) {
            if (daySteps[i] > maxSteps) {
                maxSteps = daySteps[i];
                maxDay = i;
            }
        }
        System.out.println("Максимальное количество пройденных шагов = " + maxSteps + "  - " + day[maxDay]);

/*
//        2. Мини - касса супермаркета
//        Вход:
//        целое число N —количество товаров в чеке
//        затем N целых чисел —цена каждого товара;
//        затем одно целое число —размер скидки в процентах (например, 0, 5, 10, 20).
//        Выход:
//        общая сумма до скидки;
//        сумма скидки;
//        итоговая сумма к оплате;
//        текст: «Скидка применена»или «Скидки нет»в зависимости от процента.
//        Пример:
//        N = 3, цены:100, 250, 150, скидка 10 →
//        до скидки:500
//        скидка:
//        50;
//        к оплате:450;
//        текст: «Скидка применена».

//        int item = 5;
        /*int priceItem = 7;
        int sum = 0;
        int sale = 0;
        int oneSale = 10;
        int fullSale = 0;
        int itemAfterSale = 0;
        int fullPrice = 100;

        int[] priseSale = {10,20,30,40,50,60,70};
        int[] price = {150, 250, 300, 350, 250, 550, 666};

        if (item >= 0 || item > priceItem) {
            for (int i = 0; i < item; i++) {
                sum = sum + price[i];
                oneSale = priseSale[i];
            }
            itemAfterSale = sum / fullPrice * (fullPrice - oneSale);
            sale = sum - itemAfterSale;
            System.out.println("Вы выбрали " + item + " товаров на общую сумму до скидки " + sum);
            System.out.println("Сумма скидки " + sale);
            System.out.println("Скидка " + oneSale + "% ");
            System.out.println("К оплате " + itemAfterSale);
            System.out.println("Скидка применена ");
        } else {
            System.out.println("Вы ввели отрицательное число или больше 7-ми");
        }





        Задание №3. Фильтр температуры в комнате
Вход: целое число N — количество измерений температуры за день, затем N целых чисел — значения температуры (например, в градусах Цельсия).
Выход:
минимальная и максимальная температура за день;
количество измерений, когда температура была ниже 0;
если больше половины измерений ниже 0, вывести одно сообщение (например, «Очень холодный день»), иначе другое.
Пример: N = 6, температуры: -3, 0, 2, -1, -5, 1 →
min = -5, max = 2;
ниже 0: 3 раза;
всего измерений 6, половина — 3, значит можно считать день «Очень холодным» (зависит от твоей формулировки).
         */


        int temperature = 7;
        int totalTemp = 9;
        int[] minMax = {-5, -3, -1, 0, 1, 3, 5, 3, 2};
        int min = 0;
        int max = min;
        int down0 = 0;
        int temp1 = 0;

        System.out.println("Всего показаний - " + temperature);

        for (int i = 0; i < temperature; i++) {
            System.out.println("Температуры:  " + minMax[i]);
            if (minMax[i] < min) {
                min = minMax[i];
            } else if (minMax[i] > max) {
                max = minMax[i];
            }
        }
        System.out.println("Минимальная температура - " + min);
        System.out.println("Максимальная температура - " + max);



    }

}

