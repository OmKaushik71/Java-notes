import java.io.*;
// data output stream is used to write data to a file in a machine independent way. 
// It is generally used to write data which can later be read by data input stream.
class Main{
    public static void main(String args[]){
        try{
        FileOutputStream obj = new FileOutputStream("text3.txt");
        DataOutputStream o = new DataOutputStream(obj);
        String s = "Om Kaushik";
        byte b[] = s.getBytes();
        o.write(b);
        o.flush();
        o.close();
        obj.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    // java BufferedOutput Stream and DataOutputStream are sub classes of FilterOutputStream.
    //  similarly BufferedInputStream and DataInputStream are sub classes of FilterInputStream.
}