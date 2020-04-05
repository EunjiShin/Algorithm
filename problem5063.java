import java.io.*;
import java.util.*;

public class problem5063 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int noad, yesad, ad;
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            noad = sc.nextInt();
            yesad = sc.nextInt();
            ad = sc.nextInt();

            if(yesad-ad>noad){System.out.println("advertise");}
            else if(yesad-ad==noad){System.out.println("does not matter");}
            else{System.out.println("do not advertise");}

        }

    }
}
