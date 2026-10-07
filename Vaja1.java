import java.io.IOException;
import java.io.PrintWriter;

public class Vaja1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("C:\\Rac4\\a.txt");
        pw.print('a');
        pw.close();
    }
}
