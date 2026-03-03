package oop;

import oop.model.Student;
import oop.repository.InMemoryStudentRepository;
import oop.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentManagerApp {
    public static void main(String[] args) {
        StudentRepository repository = new InMemoryStudentRepository();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== 学生管理系统 ===");
            System.out.println("1. 查看所有学生");
            System.out.println("2. 添加或更新学生");
            System.out.println("3. 删除学生");
            System.out.println("0. 退出");
            System.out.print("请选择操作: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Student> students = repository.findAll();
                    if (students.isEmpty()) {
                        System.out.println("暂无学生。");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 2:
                    System.out.print("请输入学生 ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("请输入学生姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("请输入学生年龄: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    Student student = new Student(id, name, age);
                    repository.save(student);
                    System.out.println("保存成功。");
                    break;
                case 3:
                    System.out.print("请输入要删除的学生 ID: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    repository.deleteById(deleteId);
                    System.out.println("删除成功（如果存在的话）。");
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

