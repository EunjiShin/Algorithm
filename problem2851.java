import java.io.*;
import java.util.*;

public class problem2851 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int array [] = new int[10];
        int sum=0; // 마리오가 받을 점수
        int result=0; // 마리오가 받을 점수 출력
        int a, b;

        // 버섯의 점수 입력
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }


        // 맨 처음에 100이면 그대로 끝
        // 더하지 않았을때 100과의 차이와, 더했을 때 100과의 차이를 구한다
        // 차이가 같다면 더 큰 값을, 다르다면 차이가 작은 값을 출력한다

        for(int k=0; k<array.length; k++){

            sum += array[k];

            if(sum==100){
                result=100;
                break;
            }
            if(k == 9){
                if(sum < 100) {
                    result = sum;
                    break;
                }

                else{
                    a = Math.abs(100 - sum);
                    b = Math.abs(100 - (sum - array[k]));
                    if (a == b) {
                        result = Math.max(sum, sum - array[k]);
                    } else {
                        result = (a < b) ? sum : sum - array[k];
                    }
                    break;
                }
            }

            if((sum+array[k+1] > 100) && k<=7) {
                a = Math.abs(100 - sum);
                b = Math.abs(100 - (sum + array[k + 1]));

                if (a == b) {
                    result = Math.max(sum, sum + array[k + 1]);
                } else {
                    result = (a < b) ? sum : sum + array[k + 1];
                }
                break;
            }

        }



        System.out.print(result);
    }
}
