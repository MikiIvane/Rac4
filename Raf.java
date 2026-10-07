import java.io.*;
public class Raf {
    public static void main(String[] args) throws IOException{
        RandomAccessFile r=new RandomAccessFile("raf.dat", "rw");
        for(int k=0;k<100;k++){
            r.writeInt(k);
        }
        long dolzina=r.length();
        System.out.println("dolzina datoteke je "+dolzina);
        long pozicija=r.getFilePointer();
        System.out.println("Datotecni kazalec je na "+pozicija);
        r.seek(12);
        int vrednost=r.readInt();
        System.out.println("Na poziciji 12 je "+vrednost);
        r.close();
    }
}
