import java.io.FileInputStream;

class Main{
    public static void main(String args[]){
        try{
            FileInputStream obj = new FileInputStream("text.txt");
            int i = obj.read(); // stores first character in byte form
            System.out.println((char)i);  // prints the character stored in "i" in char form
            
            int j = 0; // base value set to 0
            while((j=obj.read())!= -1){  // read all characters
                System.out.print((char)j); //print all characters
            }
            obj.close(); // closes input stream link
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}