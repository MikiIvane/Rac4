import java.io.*;
public class Binarne {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("C\\Rac4\\Dijaki.dat");
            for(int k=1;k<=5;k++){
                String ime="Ime "+k;
                int leta=(int)(Math.random()*5+20);
                double p=Math.random()*10+5;
                Dijak d=new Dijak(ime,leta,p);
                d.pisiNaDat(fos);
            }
            fos.close();
        }
        catch(IOException x){x.printStackTrace();}
    }
}
