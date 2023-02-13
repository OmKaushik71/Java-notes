import java.util.*;
class Main{
    public static void main(String args[]){
        StringTokenizer str1 = new StringTokenizer("My name is Om Kaushik");
        StringTokenizer str2 = new StringTokenizer("Java,Coding");
        while(str1.hasMoreTokens()){
            System.out.println(str1.nextToken()); // default delimiter takes " "(space) as a delimiter.
        }
        while(str2.hasMoreTokens()){
            System.out.println(str2.nextToken(",")); // custom delimiter now separates using a "," symbol
        }
    }
}