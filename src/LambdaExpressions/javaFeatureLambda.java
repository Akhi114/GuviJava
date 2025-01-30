package LambdaExpressions;

public class javaFeatureLambda {
    public static void main(String[] args) {

        Runnable task = ()-> System.out.println("Task is running!");

        Thread t = new Thread(task);
        t.start();

        }
}
