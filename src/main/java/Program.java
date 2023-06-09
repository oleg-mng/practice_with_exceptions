/**
 * 1. 📔 Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
 * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
 * <p>
 * 1.1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
 * 1.2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 * 1.3. если вместо массива пришел null, метод вернет -3
 * 1.4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
 * <p>
 * Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит
 * искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый
 * результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент
 * не найден”.
 */

public class Program {
    public static void main(String[] args) {
        int[] array = null;
        ErrorCodeOrElements el = getElement(array, 1);
        System.out.println("flag:" + el.flag + ", element:" + el.element + ", code of mistake:" + el.code
                + ", message:"+ el.text);
    }

    static ErrorCodeOrElements getElement(int[] array, int position) {
        if (array == null) {
            return new ErrorCodeOrElements(false, -1, -3, "данный массив null");
        }
        if (position >= 0 && position < array.length) {
            return new ErrorCodeOrElements(false, array[position], 1, "успешно");
        }
        if (position < 0 || position >= array.length){
            return new ErrorCodeOrElements(true, position, Error.IndexOutOfRange, "искомый элемент не найден");
        }
        else return new ErrorCodeOrElements(false, array[position], 1, "успешно");

    }

    static class ErrorCodeOrElements {
        public ErrorCodeOrElements(boolean flag, int element, int code, String text) {
            this.flag = flag;
            this.element = element;
            this.code = code;
            this.text = text;
        }

        boolean flag;
        int element;
        int code;
        String text;

    }

    class Error {
        public static int IndexOutOfRange = -1;
    }
}

