import java.io.*;
import java.util.*;

public class problem1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = n;

        for (int i = 0; i < n; i++) {
            int[] alphabet = new int[26];
            String word = sc.next();

                for (int j = 1; j < word.length(); j++) {
                    if(word.charAt(j) != word.charAt(j - 1)){
                        alphabet[word.charAt(j-1) - 'a'] = 1;
                            if(alphabet[word.charAt(j) - 'a'] == 1){
                                flag--;
                                break;
                            }
                    }

                }

            }
        System.out.print(flag);

    }
}