package tp3.ex1;

class TP3 extends Thread{
    
    @Override
    public void run(){
        super.run();
        System.out.println("my thread is running");
    }
}

public class Main {


    // create a class that extends thread and another one that implements runnable
    // they should print 'my thread is running' when running
    // when both terminated, print 'it s over !!'

    public static void main(String[] args) {


        TP3 thread1 = new TP3();
        thread1.start();
        TP3 thread2 = new TP3();
        thread2.start();
        while(thread1.isAlive() && thread2.isAlive()); // keep running until both are done
        System.out.println("it s over !!");
        //output:
        //my thread is running
        //my thread is running
        //it s over !!
    }
}
