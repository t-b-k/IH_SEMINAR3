package task4;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("ИСКЛЮЧЕНИЕ: Массив не 3х3 (не годится)!!!");
    }
}
