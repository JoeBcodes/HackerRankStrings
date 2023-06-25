import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int sumOfLength = A.length() + B.length();
        System.out.println(sumOfLength);

        String result = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(result);

        String capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capitalA + " " + capitalB);

        sc.close();

    }
}
