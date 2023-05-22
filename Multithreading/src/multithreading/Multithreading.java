/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author uwilljo
 */
public class Multithreading {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create task
        Runnable printA = new Task('a',100);
        Runnable printB = new Task('b',100);
        Runnable print100 = new PrintNum(100);
        
        //create threat
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

 // Start threads
    //thread1.start();
   // thread2.start();
   // thread3.start();
    
    ExecutorService te = Executors.newCachedThreadPool();
    
    te.execute(thread1);
    te.execute(thread2);
    te.execute(thread3);
    
            
        
    }
    
}
    
    class Task implements Runnable{
        private char c;
        private int t;
        
        public Task(char c, int t){
            this.c = c;
            this.t = c;
        }
        public void run(){
            for(int i=0;i<t;i++){
                System.out.print(c + " ");
            }
        }
    
    }
    
    class PrintNum implements Runnable {
    private int lastNum;

    /** Construct a task for printing 1, 2, ..., n */
    public PrintNum(int n) {
         lastNum = n;
    }

 @Override /** Tell the thread how to run */
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
            System.out.println(" ");
        }
 }
 }
    

