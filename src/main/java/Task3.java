import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Реализация третьего требования, чтобы можно было выбирать между
        // калькулятором или выводом самого длинного слова
        // 1 - калькулятор, 2 - вывод самого длинного слова
        System.out.println("Выберите действие 1 или 2 ");
        int choice = sc.nextInt();
        switch (choice){
            // Реализация задания Калькулятор
            case 1:
                System.out.println("Выберите действие: +, -, * или / ");
                String operator = sc.next();
                System.out.print("Введите первое дробное число: ");
                float num1 = sc.nextFloat();
                System.out.print("Введите второе дробное число: ");
                float num2 = sc.nextFloat();
                System.out.print("Получается число: ");
                if (operator.contentEquals("+")){
                    System.out.printf("%.4f", plus(num1, num2));
                }
                else if (operator.contentEquals("-")){
                    System.out.printf("%.4f", minus(num1, num2));
                }
                else if (operator.contentEquals("*")){
                    System.out.printf("%.4f", multi(num1, num2));
                }
                else if (operator.contentEquals("/")){
                    System.out.printf("%.4f", divide(num1, num2));
                }
                else{
                    System.out.print("Ошибка! Вы не выбрали  +, -, * или / ");
                }
                break;
                // Реализация второго задания Сортировка длины слов
                // и вывод самого длинного на консоль
            case 2: System.out.println("Введите целое число");
                int arrayLength = sc.nextInt();
                String array[] = new String[arrayLength];
                for (int x = 0; x < arrayLength; x++){
                    System.out.print("Введите слово : ");
                    array [x] = sc.next();
                    System.out.println("Осталось еще "+ ((arrayLength-1)-x));
                }
                //Сортировка пузырьком
                for(int i = arrayLength -1 ; i > 0 ; i--){
                    for(int y = 0 ; y < i ; y++){
                        if( array[y].length() > array[y+1].length() ){
                            String tmp = array[y];
                            array[y] = array[y+1];
                            array[y+1] = tmp;
                        }
                    }
                }
                System.out.println(array[arrayLength - 1]);
                break;
            default:
                System.out.println("Вы не выбрали 1 или 2");
                break;
            }
            //Реализация методов из прошлой задачи для выполнения математических операций
    }
    public static float plus(float a,float b) {
        float y = a + b;
        return y;
    }
    public static float minus(float a,float b) {
        float y = a - b;
        return y;
    }
    public static float multi(float a,float b) {
        float y = a * b;
        return y;
    }
    public static float divide(float a,float b) {
        float y = a / b;
        return y;
    }
}
