import java.io.*;
import java.util.*;

public class problem4673 {

    public static void main(String [] args){
    boolean [] selfnumber = new boolean[10001];
    Arrays.fill(selfnumber, true);

    for(int i=1; i<10001; i++){
        if(dn(i)<=10000) selfnumber[dn(i)] = false;
    }

    for(int k=1; k<selfnumber.length; k++){
        if(selfnumber[k]){
            System.out.println(k);
        }
    }

    }

    public static int dn(int i) {
        int result = i;
        while(i>0){
            result += i % 10;
            i /= 10;
        }
        return result;
    }

}
