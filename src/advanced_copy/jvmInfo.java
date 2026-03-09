package advanced_copy;

public class jvmInfo {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("最大内存数:" + maxMemory / 1024/ 1024 + "MB");
        System.out.println("当前分配的内存数:" + totalMemory / 1024/ 1024 + "MB");
        System.out.println("空闲内存数:" + freeMemory / 1024 / 1024 + "MB");
    }
}
