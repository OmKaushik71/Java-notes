// Thread can be created by either extending Thread class or implementing Runnable interface

class Thread1 extends Thread{
// void run is a method in Thread class which is being overridden here.
    public void run(){
        for(int i = 1; i< 11; i++){
            System.out.println("2 x "+i+" = "+2*i);
        }
    }
}
class Thread2 implements Runnable{

 public void run(){
    for(int i = 1; i< 11; i++){
        System.out.println("3 x "+i+" = "+3*i);
    }
 }
}

class Main{
    public static void main(String args[]){

        Thread1 t1 = new Thread1(); // Thread1 is directly created as it extends Thread class.
        Thread2 obj = new Thread2(); // Obj of thread2 is created which implements Runnable interface.
        Thread t2 = new Thread(obj); // Now object of Thread class is associated with Thread2 class.

        t1.start();
        t2.start();
    }
}