package advanced_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogProcessor {
    public static void main(String[] args) {
        try {
            String input = "src/advanced_copy/input.log";
            String output = "src/advanced_copy/output-error.log";

            processLog(input, output);
            System.out.println("处理完成,结果已经写入：" + output);
        } catch (Exception e) {
            System.out.println("处理日志出错了:" + e.getMessage());
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
