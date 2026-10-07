import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Vaja2 {
    public static void main(String[] args) throws IOException{
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Rac4\\a.dat"));
        dos.writeInt('a');
        dos.close();
    }
}
