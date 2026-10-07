import java.io.*;
public class Test{
    public static void main (String [] args) throws IOException{
        // DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Rac4\\dos.bin"));
        // for(int k=1;k<=5;k++){
        //     dos.writeUTF("ime"+k);
        //     dos.writeInt((int)(Math.random()*5+20));
        //     dos.writeDouble(5+Math.random()*10);
        // }
        // dos.close();
        DataInputStream dis= new DataInputStream(new FileInputStream("C:\\Rac4\\dos.bin"));
        try{
            while(true){
            String ime=dis.readUTF();
            System.out.println(ime);
            int x=dis.readInt();
            System.out.println(x);
            double y=dis.readDouble();
            System.out.println(y);
            }
        }
        catch(EOFException x){   
        }
        dis.close();
    }
}