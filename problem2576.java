import java.io.*;
import java.util.*;

public class problem2576 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int [7];
        List<Object> odd = new ArrayList<Object>();
        int sum=0;
        int min=0;

        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
            if(array[i] %2 != 0){
                sum += array[i];
                odd.add(array[i]);
            }
        }

        if(!odd.isEmpty()) {
            min = Integer.parseInt(odd.get(0).toString());

            for (int k = 0; k < odd.size(); k++) {
                if (min > Integer.parseInt(odd.get(k).toString())) {
                    min = Integer.parseInt(odd.get(k).toString());
                }
            }
        }

        if(sum == 0){ System.out.println("-1"); }
        else{
            System.out.println(sum);
            System.out.println(min);
        }

        }

    }

