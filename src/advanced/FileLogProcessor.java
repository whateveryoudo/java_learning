package advanced;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 一个简单的日志文件处理示例：
 * 读取 input.log，过滤出包含 ERROR 的行，写入 output-error.log。
 */
public class FileLogProcessor {

    public static void main(String[] args) {
        String input = "input.log";
        String output = "output-error.log";

        try {
            processLog(input, output);
            System.out.println("处理完成，结果已写入 " + output);
        } catch (IOException e) {
            System.out.println("处理日志时出错: " + e.getMessage());
        }
    }

    public static void processLog(String inputPath, String outputPath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }
}

