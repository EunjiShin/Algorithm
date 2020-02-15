import java.io.*;
import java.util.Scanner;

public class problem4344 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int sum, count, num;
        float avg, ratio;

        int a[] = new int[1000];
        for(int i = 0; i < c; i++){
            num = scanner.nextInt();
            sum = 0;
            avg = 0;
            count = 0;
            for(int j=0; j<num; j++){
                a[j] = scanner.nextInt();
                sum += a[j];
            }
            avg = (float)sum/num;

            for(int j=0; j<num; j++){
                if(a[j] > avg){
                    count++;
                }
            }
            System.out.printf("%.3f", (float)100*count/num);
            System.out.println("%");
        }
    }
}
