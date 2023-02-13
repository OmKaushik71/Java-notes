class Exception{
    public static void main(String args[]){
        try{
            int a = 19/0;
        }
        catch(Exception e){
            System.out.println("Caught Exception : "+e);
        }
        System.out.println("Program ran successfully...");
    }
}