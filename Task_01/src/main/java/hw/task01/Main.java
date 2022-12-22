package hw.task01;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * <p>
 * Для проверки валидности введенного числа исользуем регулярное выражение.
 */

public class Main {
    // шаблон выражения для проверки
    public final static String regValue = "^\\-?(\\d+(\\.\\d+)?)$";

    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        logger.info("Введено " + getFloatConsole("Введите число: "));
    }

    /**
     * Запрос вещественного числа с консоли
     * @param message   - сообщение пользователю
     * @return          - введенное число
     */
    public static float getFloatConsole(String message){
        boolean valueIsNotRight = true;
        float value = 0;
        Pattern pattern = Pattern.compile(regValue);

        // запрашиваем число пока не получим корректный ввод
        while (valueIsNotRight) {
            String valueToConvert = getStringConsole(message);

            // проверка на регулярке
            Matcher matcher = pattern.matcher(valueToConvert);

            // проверка полученного результата
            if (matcher.matches()) {
                value = Float.parseFloat(valueToConvert);
                valueIsNotRight = false;
            } else {
                System.out.println("Неверный формат числа! Повторите ввод.");
            }
        }
        return value;
    }

    /**
     * Запрос строкового значения с консоли
     * @param message - сообщение для пользователя
     * @return - строка, введенная пользавателем
     */
    public static String getStringConsole(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        return scanner.next();
    }

}