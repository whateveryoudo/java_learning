package basic_copy;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        int targetNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.print("我想好了一个0-100的整数");
        try (scanner) {
            while (true) {
                System.out.println("请输入你的结果");
                int inputNumber = scanner.nextInt();
                count++;
                if (inputNumber < targetNumber) {
                    System.out.println("小了");
                } else if (inputNumber > targetNumber) {
                    System.out.println("大了");
                } else {
                    System.out.println("正确了，你一共用了" + count + "次;" + "值是：" + targetNumber);
                    break;
                }
            }
        }
    }
}
