package JavaClass;

public class digitCounter_07 {
    public static void main(String[] args){
        int num = 34654, digitCount = 0;
        //System.out.println("The total number of digits are " + );
        if (num == 0){
            digitCount = 1;
        }
        else {
            while (num > 0){
                num /= 10;
                digitCount++;
            }
        }
        System.out.println("The number of digits are : "+  digitCount);
    }
}
