import java.io.*;

class Main{
    public static void main(String args[]){
        try{
        FileReader fr = new FileReader("text3.txt");
        FileWriter fw = new FileWriter("text4.txt");

        int i = 0;
        while((i=fr.read())!=-1){
            char c = (char)i;
            fw.write(c);
        }
        fw.flush();
        fw.close();
        fr.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}