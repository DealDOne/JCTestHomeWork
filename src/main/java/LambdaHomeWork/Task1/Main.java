package LambdaHomeWork.Task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(3, 1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
        // Работа кода ограничена невозможностью деления на ноль.
        // Решение: предусмотреть в методе обработку ошибки через выбрасывание исключения с комментарием
        int p = calc.divideByZero.apply(4, 0);
    }
}

