import java.io.*;
        import java.util.*;

public class problem1010 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int array [][] = new int [31][31];

        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            for(int u=0; u<31; u++){
                array[1][u] = u;
                // 왼쪽이 1이라면 무조건 오른쪽 개수
            }

            for(int j=2; j<=n; j++){ // 0없고 1 채웟으니까 2부터
                for(int u=j; u<=m; u++){
                    // 위에서부터 하나씩 줄여가면서(n이랑 연결된 m 빼야함)
                    for(int k=u; k>=j; k--){
                        array[j][u] += array[j-1][k-1];
                        // 위에서부터, m이 n보다 작게되면 연결 못하니까
                        // 여러 경우를 다 더해야 하니까 더함
                    }
                }
            }
            System.out.println(array[n][m]);
            // 앗시 초기화해조야하네
            for(int k=0; k<31; k++){
                for(int u=0; u<31; u++){
                    array[k][u] = 0;
                }
            }

        }


    }
}
