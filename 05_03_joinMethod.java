class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
class Main{
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        // join method is always used within try-catch blocks.
        try{

        t1.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        // Hence t2 will not run until t1 finishes its execution.
        t2.start();
    }
}