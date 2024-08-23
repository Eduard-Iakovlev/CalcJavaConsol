import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Processing {
    private String _example;
    Processing(String example){
        _example = example;
    }

    public int result(){
        int a = 0,
            b = 0;
        char operator= 'n';

        _example = _example.trim();

        // Регулярное выражение для извлечения чисел и оператора
        Pattern pattern = Pattern.compile("^(\\d+)\\s*([+\\-\\*\\/])\\s*(\\d+)$");
        Matcher matcher = pattern.matcher(_example);

        if (matcher.matches()) {
           // Извлечение чисел и оператора
           a = Integer.parseInt(matcher.group(1));
           operator = matcher.group(2).charAt(0);
           b = Integer.parseInt(matcher.group(3));

            // Проверка диапазона чисел и допустимости оператора
            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException("Допустимый диапазон чисел  от 1 до 10 включительно.");
            }
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                throw new IllegalArgumentException("Допустимы операторы только: +, -, *, /.");
            }

        }
        else {
            throw new IllegalArgumentException("Не верный формат ввода. Допустимый формат 'число оператор число'. Числа допустимы только целые");
        }

        Operation operation = new Operation(a, b, operator);

        return operation.operations();        
    }



}
