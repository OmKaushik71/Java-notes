import java.io.*;

class Main{
    public static void main(String args[]){
        try{
        FileInputStream obj = new FileInputStream("text2.txt");
        BufferedInputStream o = new BufferedInputStream(obj);

        int i = 0;

        while((i=o.read())!=-1){
            System.out.print((char)i);
        }
        o.close();
        obj.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}