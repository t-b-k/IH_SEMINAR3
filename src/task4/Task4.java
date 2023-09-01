package task4;

import java.util.ArrayList;
import java.util.List;

/**
 Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось
 (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 с детализацией, в какой именно ячейке лежат неверные данные.

 2. В методе main() вызвать полученный метод, обработать возможные исключения
 MyArraySizeException и MyArrayDataException и вывести результат расчета
 (сумму элементов, при условии, что подали на вход корректный массив).
 */
public class Task4 {
    static String[][] arr = new String[][]{
            {"1", "1.5", "1.5"},
            {"1", "ads", "1.5"},
            {"1", "1.5", "m"}
    };

    public static void main(String[] args) {
        System.out.println(sum2dVer2(arr));
    }

    public static double sum2d(String[][] arr) {
        if (isNotSquareArray(arr)) throw new MyArraySizeException();
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!isDouble(arr[i][j])) throw new MyArrayDataException(i, j);
                result += Double.parseDouble(arr[i][j]);
            }
        }
        return result;
    }
    public static double sum2dVer2(String[][] arr) {
        if (isNotSquareArray(arr)) throw new MyArraySizeException();
        double result = 0;
        List<Point2D> points = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!isDouble(arr[i][j])) points.add(new Point2D(i, j));
                else result += Double.parseDouble(arr[i][j]);
            }
        }
        if (!points.isEmpty()) throw new MyArrayDataException(points);
        return result;
    }

    public static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isNotSquareArray(String[][] arr) {
        for (String[] elem: arr) {
            if (elem.length != arr.length) return true;
        }
        return false;
    }
}
