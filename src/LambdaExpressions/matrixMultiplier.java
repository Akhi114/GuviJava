package LambdaExpressions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class matrixMultiplier {
    public static void main(String [] args) {
        int[] n = {3,4,2};
        int[] m = {6,4,1};
        int[] p = {9,5,8};

        int[] A = Arrays.stream(n).map(i -> i * m[Arrays.asList(n).indexOf(i)]).toArray();
        int[] B = Arrays.stream(m).map(i -> i * p[Arrays.asList(n).indexOf(i)]).toArray();
        System.out.println(A);
        int[] C = Arrays.stream(n).map(i -> i * p[Arrays.asList(n).indexOf(i)]).toArray();
    }
}
