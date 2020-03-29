import java.io.*;
import java.util.*;

public class problem16199 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int birth, month, day;
        int age, count, year;
        int today, tmonth, tday;

        birth = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();

        today = sc.nextInt();
        tmonth = sc.nextInt();
        tday = sc.nextInt();

        count = today-birth+1;
        year = today-birth;
        if((tmonth==month && tday>=day)||(tmonth>month)){
            age = today-birth;
        }
        else{
            age = today-birth-1;
        }

        System.out.println(age);
        System.out.println(count);
        System.out.println(year);
    }
}
