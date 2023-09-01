package task4;

import java.util.List;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int x, int y) {
        super(String.format("ИСКЛЮЧЕНИЕ: В ячейке [%d,%d] не число!!!", x, y));
    }
    public MyArrayDataException(List<Point2D> points) {
        super(String.format("ИСКЛЮЧЕНИЕ: В ячейках:\n %s \n не число!!!", points));
    }
}
