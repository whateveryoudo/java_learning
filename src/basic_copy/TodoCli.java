package basic_copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoCli {
    public static void main(String[] args) {
        List<String> todos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            while (true) {
                System.out.println("===一个建议的todo cli工具，用于学习数组的一些操作===");
                System.out.println("1.查看任务");
                System.out.println("2.添加任务");
                System.out.println("3.删除任务");
                System.out.println("0.退出");
                System.out.print("请选择序号进行操作：");

                int choice = scanner.nextInt();

                scanner.nextLine();

                switch (choice) {
                    case 1:
                        if (todos.isEmpty()) {
                            System.out.println("当前无任务");
                        } else {
                            System.out.println("当前任务列表如下:");
                            for (int i = 0; i < todos.size(); i++) {
                                System.out.println((i + 1) + "." + todos.get(i));
                            }
                        }
                        break;
                    case 2:
                        System.out.println("请输入你的任务:");
                        String task = scanner.nextLine();
                        todos.add(task);
                        System.out.println("任务已添加!");
                        break;
                    case 3:
                        System.out.println("请输入你要删除任务的序号:");
                        int DeleteIndex = scanner.nextInt();
                        scanner.nextLine();

                        int realIndex = DeleteIndex - 1;

                        if (realIndex < 0 || realIndex >= todos.size()) {
                            System.out.println("非法的序号区间");
                        } else {
                            todos.remove(realIndex);
                            System.out.println("任务已删除!");
                        }
                        break;

                    case 0:
                        System.out.println("再见!");
                        break;

                    default:
                        System.out.println("无效的选项！请重新选择");
                        break;
                }

                System.out.println();
            }
        }

    }
}
