import java.util.Scanner;

public class test {
    public static void main(String[] args){
        int i = 0;
        int maxNum=0;
        int [] Arr = {1,1,1,2,4,3,2,3,4,5,3,2,1,2,3,4,5};
        for (i = 0; i<Arr.length; i++){
            if (Arr[i] > maxNum){
                maxNum = Arr[i];
            }
        }
        for (i = 0; i<maxNum; i++){
            for (int j = 0; i<Arr.length-1; j++){
                if (Arr[i] == Arr[j]){
                }
            }
        }
    }
}
