package advanced;

/**
 * 一个简单的 JVM 信息查看示例，用于理解堆内存等概念。
 */
public class JvmInfo {

    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();

        System.out.println("最大内存 (maxMemory): " + maxMemory / 1024 / 1024 + " MB");
        System.out.println("当前分配内存 (totalMemory): " + totalMemory / 1024 / 1024 + " MB");
        System.out.println("当前空闲内存 (freeMemory): " + freeMemory / 1024 / 1024 + " MB");
    }
}

