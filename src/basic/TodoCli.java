import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoCli {
    public static void main(String[] args) {
        List<String> todos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== 简易 TODO 列表 ===");
            System.out.println("1. 查看任务");
            System.out.println("2. 添加任务");
            System.out.println("3. 删除任务");
            System.out.println("0. 退出");
            System.out.print("请选择操作: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 读取掉行尾换行

            switch (choice) {
                case 1:
                    if (todos.isEmpty()) {
                        System.out.println("当前没有任务。");
                    } else {
                        System.out.println("当前任务：");
                        for (int i = 0; i < todos.size(); i++) {
                            System.out.println((i + 1) + ". " + todos.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.print("请输入任务内容: ");
                    String task = scanner.nextLine();
                    todos.add(task);
                    System.out.println("任务已添加。");
                    break;
                case 3:
                    System.out.print("请输入要删除的任务序号: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // 读取掉行尾换行
                    int realIndex = index - 1;
                    if (realIndex < 0 || realIndex >= todos.size()) {
                        System.out.println("无效的序号。");
                    } else {
                        todos.remove(realIndex);
                        System.out.println("任务已删除。");
                    }
                    break;
                case 0:
                    System.out.println("再见！");
                    return;
                default:
                    System.out.println("无效的选项，请重新选择。");
            }

            System.out.println();
        }
    }
}

