package ru.spsuace.helloworld.task1;


import java.beans.PropertyEditorManager;

/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerTask {

    /**
     * Сумма чисел от 1 до n (1 + 2 + 3 + ... + n)
     * Пример: (5) -> 15
     */
    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i += 1) {
            sum = sum + i + 1;
        }
        return sum;
    }

    /**
     * Гусеница поднимается по стене длиной height на высоту top за день, ночью гусеница сползает на bottom.
     * Сколько дней понадобится гусенице, чтобы доползти до потолка. Если она этого никогда не сможет сделать,
     * Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 2) -> 8
     */
    public static int snake(int height, int top, int bottom) {
        int day = 1;
        int snake = 0;
        for (day = 1; ; day = day + 1) {
            if (top > bottom) {
                snake = snake + top;
                if (snake < height) {
                    snake = snake - bottom;
                    continue;
                } else {
                    break;
                }
            } else {
                if (top < height) {
                    day = Integer.MAX_VALUE;
                    break;
                } else {
                    day = 1;
                    break;
                }
            }
        }
        return day;
    }

    /**
     * Дано число n и номер разряда order. Выведите цифру стояющую на нужном разряде
     * Пример: (454355, 3) -> 3
     */
    public static int kDecimal(int n, int order) {
        return (int) (Math.abs(n)%Math.pow(10,order)/Math.pow(10,order-1));
    }


    /**
     * Выведите факториал от числа n
     * Пример: (5) -> 120
     */
    public static long factorial(byte n) {
        long factorial = 1;
        for (int i = 2; i < n + 1; i += 1) {
            factorial *= i;
        }
        return factorial;
    }
}
