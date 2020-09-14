import  java.util.Scanner;

/**
 * @author Рольник Б.Б.
 * @param
 * @see #resultFinder(float, float)
 */

public class Base {
    public static void main(String[] args) {
        // объявляем объект sc класса Scanner
        Scanner sc = new Scanner(System.in);

        // Просим ввести первое число
        System.out.print("Введите первое дробное число: ");
        float num1 = sc.nextFloat();

        // Просим ввести второе число
        System.out.print("Введите второе дробное число: ");
        float num2 = sc.nextFloat();

        // Выводим результат через метод resultFinder
        System.out.print("Получается число: ");
        System.out.printf("%.4f", resultFinder(num1 ,num2));

        }

    /**
     * @param a перове введенное число
     * @param b второе введенное число
     * @return результат сложения введенных чисел
     */
    public static float resultFinder(float a,float b) {
        // реализация метода сложения двух чисел
        float y = a + b;
        // Возращаем число y
        return y;
    }
}

