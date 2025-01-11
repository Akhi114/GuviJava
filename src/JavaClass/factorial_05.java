package JavaClass;

public class factorial_05 {
    public static void main(String[] args){
        int num = 5, sumUp = 1;
        for (int i = 1; i<=num; i++){
            sumUp = sumUp * i;
        }
        System.out.println("Factorial for the " + num + " is: " + sumUp);
    }
}
