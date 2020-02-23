import java.io.*;
import java.util.*;

public class problem10818 {
    public static int[] MergeSort(int[] array){
        if(array.length < 2) return array;

        int mid = array.length / 2;
        int [] left = MergeSort(Arrays.copyOfRange(array, 0, mid));
        int [] right = MergeSort(Arrays.copyOfRange(array, mid, array.length));

        int [] merged = new int [array.length];
        int i, j, k;
        i = 0;
        j = 0;
        k = 0;

       while(j < left.length && k < right.length ){
           if(left[j] < right[k]) merged[i++] = left[j++];
           else merged[i++] = right[k++];
       }
       while(j < left.length){
           merged[i++] = left[j++];
       }
       while(k < right.length){
           merged[i++] = right[k++];
       }
        return merged;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min, max;

        int [] array = new int [n];
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        int [] after = MergeSort(array);
        min = after[0];
        max = after[after.length-1];

        System.out.print(min + " " + max);
    }
}
