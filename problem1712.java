import java.io.*;
        import java.util.*;

public class problem1712 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n;

        if(c-b > 0){
            n = a/(c-b) +1;
            System.out.print(n);
        }
        else{        System.out.print(-1);}

    }
}
