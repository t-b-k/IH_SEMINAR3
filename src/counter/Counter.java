package counter;

import java.io.IOException;

/**
 Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable {
    private int count;
    private boolean closed;
    public Counter () {
        count = 0;
        closed = false;
    }

    public int getCount() {
        return count;
    }

    public void add () throws IOException {
        if (isClosed()) throw new IOException("Method add(): counter.Counter is closed.");
        else count++;
    }
    public boolean isClosed () {
        return closed;
    }
    @Override
    public void close() throws Exception {
        closed = true;

    }
}
