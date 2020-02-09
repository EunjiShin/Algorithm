import java.io.*;
import java.util.StringTokenizer;

public class problem15552 {
    public static void main(String [] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer token = new StringTokenizer(reader.readLine());
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());

            writer.write(A+B + "\n");
        }

        writer.flush();
    }
}
