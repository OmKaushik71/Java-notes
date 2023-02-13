// A class to print multiplication table
class PrintNumbers{
    void print(int n){
        for(int i = 1; i<=n ; i++){

        System.out.println(n*i);
        // invoking delay between each thread process
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        }
    }
}
// Creating thread class
class MyThread1 extends Thread{
    PrintNumbers p; // using the object of table class
    MyThread1(PrintNumbers p){
        this.p = p;  // binding the thread object with the object of table class
    }
    // Since it is a thread it will be executed by void run() method
    public void run(){
    p.print(20);
    }
}
// creating another thread to print table
class MyThread2 extends Thread{
    PrintNumbers p;
    MyThread2(PrintNumbers p){
        this.p = p;
    }
    public void run(){
    p.print(10);
    }
}
class Main{
    public static void main(String args[]){
        // Creating object of Table class
        PrintNumbers obj = new PrintNumbers();
        // creating threads using the above object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();

        // the output of this program will be random
    }
}