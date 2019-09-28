import java.io.*;
import java.util.*;

public class DetectiveBook {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> ar = new ArrayList<Integer>(n);
        // long[] ar1 = new long[n];
        for (int i = 0; i < n; i++) {
            ar.add(s.nextInt());
        }
        // for (int i = 0; i < n; i++) {
        // System.out.print(ar.get(i)+" ");
        // }
        int mp = ar.get(0);
        int noofdays = 0;
        for (int i = 0; i < n; i++) {
            if (ar.get(i) == i + 1 && ar.get(i) == mp) {
                noofdays++;
                mp++;
                // continue;
            } else if (ar.get(i) > i + 1 && ar.get(i) > mp) {
                // update current mp
                mp = ar.get(i);
                // continue;
            }
        }
        System.out.println(noofdays);
        s.close();
    }

}