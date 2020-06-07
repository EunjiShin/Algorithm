import java.io.*;
import java.util.*;

public class problem10837 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int k=sc.nextInt();
        int c=sc.nextInt();
        int count=0;

        for(int i=0; i<c; i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            // 남은 라운드 동안에 차이를 매꿀수잇으면 1.

            if(m==n){
                // m==n일경우엔 무조건 1.
                System.out.println("1");
            }
            // 남은횟수는 k-count
            else if(m>n){
                int remain = k-m;
                // 5 1의 경우, 3라운드에서 끝난다.
                int minus = m-n;
                // minus는 remain보다 작을 수 없음.
                if(minus-remain<=2){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else{ // n>m
                int remain = k-n;
                int minus = n-m;
                if(minus-remain<=1){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
        }

        //아니넹 0 3의 경우 remain<minus라도 1이 되는 경우임
        // 그럼 어쩌냐고
        // 테스트케이스 5 5는 m==n이면 1이라는 예시
        // 5 1은 remain=0, minus=4로 remain < minus면 0이라는 예시
        // 0 3은 remain=2, minus=3으로 remain < minus인데 1이라는 예시
        // 1 4는 remain=1, minus=3으로 remain < minus니까 0이라는 예시
        // 0 3 이랑 1 4랑 둘다 minus=3이고 remain<minus인데 remain만 차이.
        // 둘다 m < n인 경우, 그니까 동수가 점수 더 얻은 경우.
        //  2 0은 가능, 0 2는 불가능임. 영희가 먼저 던져서 전자는 가능한거
        // 영희가 두번째 판에서 1던진 이후 동수 던지기 전에 게임 끝나니까ㅇㅇ
        // 즉 remain < minus라도 동수가 더 클때 -> 둘의 차가 1이면 1.
        // 2 0은 가능, 0 2는 불가능이므로 영희는 둘의 차가 2까지는 2.


    }
}
