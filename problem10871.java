import java.io.*;
import java.util.Scanner;

public class problem10871 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scanner.nextInt();
            if(a[i] < x){
                System.out.print(a[i] + " ");
            }
        }

}
}
