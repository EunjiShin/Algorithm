import java.io.*;
import java.util.*;

public class problem9625 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        // 특정 문자를 문자열로 바꿀수없고 / 배열로하면 정말 1도 모르겟으니까
        // 나오는 개수만 입력하면 됨 -> 숫자로처리
        int a=1;
        int b=0; // 시작할 때 b 없으니까
        int temp;

        for(int i=0; i<k; i++){
            temp = a;
            a = a-a;
            // BABBA 에서 모든 A는 B로 바뀌어야하므로 a 수만큼 뺀다.
            a += b;
            // BABBA -> BBBBB -> BABBABAB. B가 BA되니까, B 개수만큼 A 증가
            b += temp;
            // b는 맨 처음 a 개수 따라가니까 미리저장햇던 temp로 처리
        }

        System.out.println(a+" "+b);

    }
}
