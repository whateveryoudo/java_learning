package basic_copy;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字:");

        List<String> opertorList = Arrays.asList("+", "-", "*", "/");

        double number1 = scanner.nextDouble();
        String op;
        while (true) {
            System.out.print("请输入运算符（+-*/ 里任意一个）");

            op = scanner.next();

            if (opertorList.contains(op)) {
                break;
            }
            System.out.println("非法的操作字符，请重新输入");

        }

        System.out.print("请输入第二个数字:");

        double number2 = scanner.nextDouble();

        try (scanner) {
            double result;
            switch (op) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("除数不能为0");
                        return;
                    }
                    result = number1 / number2;
                    break;
                default:
                    return;
            }

            System.out.println("结果是：" + result);

        }
    }

}
