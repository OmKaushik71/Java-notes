class PrintNumbers{
    // declaring synchronized method
    synchronized void print(int n){
        for(int i = 1; i<=n; i++){
            System.out.println(n*i);
        }
    }
}
class MyThread1 extends Thread{
    PrintNumbers p;
    public MyThread1(PrintNumbers p){
        this.p = p;
    }
    public void run(){
        p.print(20);
    }
}
class MyThread2 extends Thread{
    PrintNumbers p;
    public MyThread2(PrintNumbers p){
        this.p = p;
    }
    public void run(){
        p.print(40);
    }
}
class Main{
    public static void main(String args[]){
        PrintNumbers obj = new PrintNumbers();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
        // since synchronized method is used, therefore t1 will complete its execution and then t2.
    }
}