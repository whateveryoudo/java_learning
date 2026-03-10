package oop_copy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import oop_copy.model.Student;
import oop_copy.respository.InMemoryStudentRepository;

public class StudentManagerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InMemoryStudentRepository studentRep = new InMemoryStudentRepository();

        List<Integer> opOrders = List.of(0, 1, 2, 3, 4);
        int op;
        try (scanner) {
            while (true) {
                System.out.println("欢迎进入学生管理系统");
                System.out.println("请输入0-4的数字：1-查询所有学生；2-根据id查询某个学生；3-新增/修改学生；4-根据id删除某个学生；0-退出");
                op = scanner.nextInt();
                if (!opOrders.contains(op)) {
                    System.out.print("非法操作序号，请重新输入");
                    continue;
                }
                switch (op) {
                    case 1:
                        List<Student> students = studentRep.findAll();
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println(
                                    "学生" + i + "的信息(姓名：" + students.get(i).getName() + "；年龄)"
                                            + students.get(i).getAge());
                        }
                        break;
                    case 2:
                        System.out.print("请输入学生id");
                        int queryId = scanner.nextInt();
                        Student target = studentRep.findById(queryId);
                        System.out.println("查询到的信息为:");
                        System.out.println("姓名:" + target.getName());
                        System.out.println("年龄:" + target.getAge());
                        break;
                    case 3:
                        System.out.print("请输入要保存的学生id:");
                        int saveId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("请输入要保存的学生姓名:");
                        String saveName = scanner.nextLine();
                        System.out.print("请输入要保存的学生年龄:");
                        int sageAge = scanner.nextInt();
                        studentRep.save(new Student(saveId, saveName, sageAge));
                        System.out.println("保存成功！");
                        break;
                    case 4:
                        System.out.print("请输入要删除的学生id");
                        int delId = scanner.nextInt();
                        studentRep.deleteById(delId);
                        System.out.println("删除成功");
                        studentRep.findAll();
                        break;
                    case 0:
                        System.out.println("再见");
                        return;
                    default:
                        break;
                }
            }
        }

    }
}
