import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字: ");
        double a = scanner.nextDouble();

        System.out.print("请输入运算符 (+, -, *, /): ");
        String op = scanner.next();

        System.out.print("请输入第二个数字: ");
        double b = scanner.nextDouble();

        double result;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("除数不能为 0");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("不支持的运算符: " + op);
                return;
        }

        System.out.println("结果: " + result);
    }
}

