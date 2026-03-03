package advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 简单的多线程示例：
 * 使用线程池并行处理多个“任务”。
 */
public class MultiThreadDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 8; i++) {
            int taskId = i;
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("任务 " + taskId + " 正在由线程 " + threadName + " 处理");
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("任务 " + taskId + " 完成");
            });
        }

        executor.shutdown();
    }
}

