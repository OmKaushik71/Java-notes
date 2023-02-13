import java.io.*;

class Main{
    public static void main(String args[]){
        try{
            FileOutputStream obj = new FileOutputStream("text2.txt");
            // Adding buffer to output stream
            BufferedOutputStream o = new BufferedOutputStream(obj);
            String s = "Om Kaushik";
            byte b[] = s.getBytes();
            o.write(b);
            o.flush(); // flush is generally used with output streams
            o.close();
            obj.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}