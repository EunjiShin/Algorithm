import java.io.*;
import java.util.*;

public class problem2822 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int [8]; // 입력 배열 -> 그대로 쓸것
        int [] sort_array = new int [8]; // 오름차순 정렬할 배열
        int [] index_array = new int [5]; // 문제 번호 저장할 배열
        int sum=0;
        int a=0;

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
            sort_array[i] = array[i];  // 그대로 넣어주기
        }

        Arrays.sort(sort_array); // 오름차순 정렬

        // 두 배열을 비교해서 -> 제일 큰 5개가 원래 배열에서 어떤 인덱스였는지 찾아서 출력

        for(int k=7; k>2; k--){
            sum += sort_array[k]; // 점수 구하고
        }

        System.out.println(sum);

        for(int k=7; k>2; k--){
            for(int u=0; u<8; u++){
                if(sort_array[k] == array[u]){
                    index_array[a] = u+1;
                    a++;
                }
            }
        }

        Arrays.sort(index_array);

        for(int k=0; k<5; k++){
            System.out.print(index_array[k]+" ");
        }

    }
}
