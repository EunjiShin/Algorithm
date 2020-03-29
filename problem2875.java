import java.io.*;
import java.util.*;

public class problem2875 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        int team=0;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

            if(n/2 <= m){ team = n/2; }
            else{ team = m; }
            k -= (n+m)-team*3;

            if(k>0){
                team -= (k+2)/3;
            }

        System.out.println(team);
    }
}
