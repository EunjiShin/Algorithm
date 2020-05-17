import java.io.*;
import java.util.*;

public class problem2578 {

    static int array [][] = new int[5][5];
    static int test [][] = new int [5][5];
    static int count;

    public static int check(int num){
        // 빙고 체크
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++) {
                if (array[i][j] == num) {
                    array[i][j] = 0;
                }
            }
        }
        count = 0;

        for(int i=0; i<5; i++){  // 가로 체크
            int sum=0;
            for(int j=0; j<5; j++){
                sum += array[i][j];
            }
            if(sum == 0){
                count++;
            }
        }

        for(int i=0; i<5; i++){  // 세로 체크
            int sum=0;
            for(int j=0; j<5; j++){
                sum += array[j][i];
            }
            if(sum == 0){
                count++;
            }
        }

        int cnt = 0;   // 대각선 양방향 체크
        for(int i=0; i<5; i++){
            cnt += array[i][i];
        }
        if(cnt == 0){
            count++;
        }
        cnt = 0;
        for(int i=0; i<5; i++){
            cnt += array[0+i][5-1-i];
        }
        if(cnt ==0){
            count++;
        }

        return count;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){
            String line[] = sc.nextLine().split(" ");
            for(int j=0; j<5; j++){
                array[i][j] = Integer.parseInt(line[j]);
            }
        }

        for(int i=0; i<5; i++){
            String answer[] = sc.nextLine().split(" ");
            for(int j=0; j<5; j++) {
                test[i][j] = Integer.parseInt(answer[j]);
                if(check(test[i][j])>=3){
                    System.out.println((5*i)+(j+1));
                    return;
                }
            }
        }


    }
}
