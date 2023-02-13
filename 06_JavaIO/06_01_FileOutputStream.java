import java.io.FileOutputStream;

class Main{
    public static void main(String args[]){
       try{
         FileOutputStream obj = new FileOutputStream("text.txt");
         String s = "Om Kaushik";
         byte b[] = s.getBytes();
        obj.write(b);
        obj.close();
       }
       catch(Exception e){
        System.out.println(e);
       }
    }
}