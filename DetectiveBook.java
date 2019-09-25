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
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i)+" ");
        }

        s.close();
    }

}