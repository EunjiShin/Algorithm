import java.io.*;
import java.util.*;

public class problem7785 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        String home;

        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<n; i++){
            name = sc.next();
            home = sc.next();
            if(home.equals("enter")){
                list.add(name);
            }
            if(home.equals("leave")){
                list.remove(name);
            }
        }

        list.sort(null);

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
