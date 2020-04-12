import java.io.*;
import java.util.*;

public class problem11728 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        int index=0;

        int [] array1 = new int [n];
        int [] array2 = new int [m];
        int [] array3 = new int [n+m];

        String[] one = br.readLine().split(" ");
        for(int i=0; i<array1.length; i++){
            array1[i] = Integer.parseInt(one[i]);
            array3[index++] = array1[i];
        }
        String[] two = br.readLine().split(" ");
        for(int k=0; k<array2.length; k++){
            array2[k] = Integer.parseInt(two[k]);
            array3[index++] = array2[k];
        }

        Arrays.sort(array3);
        StringBuilder bu = new StringBuilder();
        for(int j=0; j<array3.length; j++){
            bu.append(array3[j]).append(" ");
        }
        System.out.println(bu.toString());

    }
}
