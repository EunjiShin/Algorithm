import java.io.*;
        import java.util.*;

public class problem1120 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String b_token;
        int count=0;
        int array[] = new int [b.length() - a.length()+1];

        for(int i=0; i<b.length()-a.length()+1; i++){
            b_token = b.substring(i, a.length()+i);
            // i부터 a 길이만큼 부분문자열만들어서
            for(int j=0; j<b_token.length(); j++){
                if(b_token.charAt(j) != a.charAt(j)){
                    count += 1;
                }
            }
            array[i] = count;
            count=0;
        }

        Arrays.sort(array);
        System.out.println(array[0]);
    }
}
