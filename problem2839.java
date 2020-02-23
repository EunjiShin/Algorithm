import java.io.*;
        import java.util.*;

public class problem2839 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int quotient=0;
        int remain=0;

        while(n % 5 != 0 && n > 0){
            n -= 3;
            remain++;
        }
        if(n % 5 == 0){
            quotient = n/5;
        }
        if(n < 0){
            System.out.print(-1);
        }

        else{
            System.out.print(quotient+remain);
        }

    }
}
