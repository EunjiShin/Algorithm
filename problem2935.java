import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class problem2935 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char c;
        BigInteger a = new BigInteger(sc.nextLine());
        c = sc.nextLine().charAt(0);
        BigInteger b = new BigInteger(sc.nextLine());

        switch(c){
            case '+':
                System.out.println(a.add(b));
                break;
            case '*':
                System.out.println(a.multiply(b));
                break;
        }
    }
}
