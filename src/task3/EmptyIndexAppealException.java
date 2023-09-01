package task3;

/**
 * Задание 3.2
 Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
 Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class EmptyIndexAppealException extends NullPointerException {
    public EmptyIndexAppealException() {
        super("ИСКЛЮЧЕНИЕ: Произошло обращение по нулевой ссылке (null)");
    }
    public EmptyIndexAppealException(String message) {
        super(message);
    }
}
