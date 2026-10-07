import java.io.*;

public class UrediZapise {
    public static void main(String[] args) throws IOException{
        Zapis x1=new Zapis(1,"111111111111","ucitelj 1",30);
        Zapis x2=new Zapis(1,"111111311111","ucitelj 8",31);
        Zapis x3=new Zapis(1,"111111141111","ucitelj 6",12);
        Zapis x4=new Zapis(1,"115111111111","ucitelj 9",3);
        RandomAccessFile r=new RandomAccessFile("Zapisi.dat", "rw");
        x1.pisi(r);
        x2.pisi(r);
        x3.pisi(r);
        x4.pisi(r);
        System.out.println("izracunana velikost: "+x1.velikost());
        System.out.println("dat kaz is on: "+r.getFilePointer());
    }
}
