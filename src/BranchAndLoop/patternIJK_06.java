package BranchAndLoop;

public class patternIJK_06 {
    public static void main(String[] args) {
        int k = 5; // value assigned for the pattern.

        for (int i=1; i<=k; i++) {
            for (int j=1; j<=k; j++) {
                if (j <= i) {
                    System.out.print(6 - j + " ");
                }
                else{
                    System.out.print(6 - i + " ");
                }
            }
            System.out.println();
        }
    }
}
