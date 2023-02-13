// class CustomException extends Exception{

// }
// class Test{
//     int cal(int n) throws CustomException{
//         if(n == 3) {
//             throw new CustomException();
//         }
//         else return n;
//     }
//     public static void main(String args[]){
//         Test obj = new Test();
//         try{
//             obj.cal(3);
//         }
//         catch(CustomException e){
//             System.out.println(e);
//         }

        
//     }
// }

class Odd extends Exception{
    public Odd(String str){
        super(str);
    }
}

class Main{
    int cal(int n) throws Odd{
        if(n == 3) throw new Odd("3 entered");
        else return n;
    }
    public static void main(String args[]){
        Main obj = new Main();
        try{
            obj.cal(3);
        }
        catch(Odd e){
            System.out.println(e);
        }
       
    }
}