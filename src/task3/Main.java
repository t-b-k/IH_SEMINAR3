package task3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//        Integer[] array = new Integer[]{1,2,null,4,5};
//        emptyIndex(array);
        try {
            nonExistedFile();
        } catch (NonExistedFileException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void emptyIndex(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) throw new EmptyIndexAppealException("ИСКЛЮЧЕНИЕ: Произошло обращение по нулевой ссылке (null)"+
                    String.format(" в ячейке с индексом %d", i));
        }
    }
    public static void nonExistedFile() throws NonExistedFileException {
        try {
            FileReader reader = new FileReader("newFile.txt");
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException(e.getMessage());
        }
    }
}
