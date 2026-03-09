package advanced_copy;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class MultiThreadDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 8; i++) {
            int taskId = i;
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("任务" + taskId + " 正在被线程" + threadName + "处理");

                try {
                    Thread.sleep(500L);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("任务 " + taskId + "已完成");
            });
        }
        executor.shutdown();
    }

}
