import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1; // 1-100
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("我已经想好了一个 1-100 的数字，来猜一猜吧！");

        while (true) {
            System.out.print("请输入你的猜测: ");
            int guess = scanner.nextInt();
            count++;

            if (guess == target) {
                System.out.println("恭喜你，猜对了！总共猜了 " + count + " 次。");
                break;
            } else if (guess < target) {
                System.out.println("小了，再试试~");
            } else {
                System.out.println("大了，再试试~");
            }
        }
    }
}

