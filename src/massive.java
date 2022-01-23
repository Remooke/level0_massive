import sun.plugin.javascript.navig.ImageArray;

import java.util.Arrays;
import java.util.Scanner;

public class massive {

    public static void main(String[] args) {
            /*
1 Создать массив, содержащий 10 первых нечетных чисел,
  следующих после введенного с клавиатуры числа.
  Элементы массива вывести в консоль, разделяя точкой с запятой.

2 Найти наименьший элемент массива,
введенного с клавиатуры, вывести наименьшее и наибольшее числа, а также их позиции в массиве.

3 Поменять в массиве, введенном с клавиатуры,
наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.
После замены будет выглядеть {4, 8, 0, 6, -5}.

4 Найти среднее арифметическое всех элементов каждой строки
 двухмерного массива, введенного с клавиатуры. Вывести в консоль результаты.
     */
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1. Создать массив, содержащий 10 первых нечетных чисел,\n" +
                "  следующих после введенного с клавиатуры числа.\n" +
                "  Элементы массива вывести в консоль, разделяя точкой с запятой.");
        Scanner scanner = new Scanner(System.in);
        double[] massive = new double[10];
        System.out.println("Введите число:");
        double num = scanner.nextDouble();

        for (int i = 0; i < massive.length; i++) {
            if (num % 2 == 0) {
                massive[i] = num + 1;
            } else {
                massive[i] = num + 2;
            }
            num = num + 2;
            System.out.print(massive[i] + "; ");
        }
    }

    // 2 Найти наименьший элемент массива,
    //введенного с клавиатуры, вывести наименьшее и наибольшее числа, а также их позиции в массиве.
    public static void task2() {
        System.out.println();
        System.out.println("Задание 2. Найти наименьший элемент массива,\n " +
                "введенного с клавиатуры, вывести наименьшее и наибольшее числа, а также их позиции в массиве.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        double min = 999999999;
        double max = -999999999;
        int positionMin = 0;
        int positionMax = 0;

        double[] myArray = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + " число массива:");
            myArray[i] = scanner.nextDouble();
            if (myArray[i] > max) {
                max = myArray[i];
                positionMax = i;
            }
            if (myArray[i] < min) {
                min = myArray[i];
                positionMin = i;
            }
        }
        System.out.println("Максимальный элемент массива: " + max + ". c индексом: " + positionMax);
        System.out.println("Максимальный элемент массива: " + min + ". c индексом: " + positionMin);
    }

    //3 Поменять в массиве, введенном с клавиатуры,
    //   наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}.
    //  После замены будет выглядеть {4, 8, 0, 6, -5}.
    public static void task3() {
        System.out.println();
        System.out.println("Задание 3. Поменять в массиве, введенном с клавиатуры, \n" +
                "наибольший и наименьший элементы массива местами.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        double min = 999999999;
        double max = -999999999;
        int positionMin = 0;
        int positionMax = 0;

        double[] myArray = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + " число массива:");
            myArray[i] = scanner.nextDouble();
            if (myArray[i] > max) {
                max = myArray[i];
                positionMax = i;
            }
            if (myArray[i] < min) {
                min = myArray[i];
                positionMin = i;
            }
        }

        myArray[positionMax] = min;
        myArray[positionMin] = max;
        for (int i = 0; i < n; i++) {
            System.out.print(myArray[i] + "; ");
        }
    }

    public static void task4() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 4. Найти среднее арифметическое всех элементов каждой строки \n" +
                "двухмерного массива, введенного с клавиатуры.\n" +
                "Вывести в консоль результаты.\n");
        System.out.println("Введите кол-во строк массива:");
        int y = scanner.nextInt();
        System.out.println("Введите количество столбцов массива:");
        int x = scanner.nextInt();
        int[][] myArray = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Введите [" + i + "][" + j + "] элемент матрицы");
                myArray[i][j] = scanner.nextInt();
            }
        }
        double sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum = sum + myArray[i][j];
            }
            System.out.println("Среднее арифметическое строки " + (i + 1) + ": " + sum / y);
            sum = 0;
        }
    }


}
