package day6Java;

//Demonstrates various thread concepts in Java
class MyThread extends Thread {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName() + " is running. Count: " + i);
         try {
             Thread.sleep(500); // Pauses the thread for 500ms
         } catch (InterruptedException e) {
             System.out.println(Thread.currentThread().getName() + " was interrupted.");
         }
     }
 }
}

class MyRunnable implements Runnable {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName() + " (Runnable) is running. Count: " + i);
         try {
             Thread.sleep(300); // Pauses the thread for 300ms
         } catch (InterruptedException e) {
             System.out.println(Thread.currentThread().getName() + " was interrupted.");
         }
     }
 }
}

class SharedResource {
 synchronized void printNumbers() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName() + " is printing: " + i);
         try {
             Thread.sleep(200); // Simulate some work
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted during synchronized block.");
         }
     }
 }
}

class Worker extends Thread {
 private final SharedResource resource;

 public Worker(SharedResource resource) {
     this.resource = resource;
 }

 @Override
 public void run() {
     resource.printNumbers();
 }
}

public class ThreadConceptDemo {
 public static void main(String[] args) {
     // 1. Extending Thread Class
     MyThread thread1 = new MyThread();
     thread1.setName("Thread-1");

     // 2. Implementing Runnable Interface
     Thread thread2 = new Thread(new MyRunnable(), "Thread-2");

     // Start threads
     thread1.start();
     thread2.start();

     // 3. Synchronization Example
     SharedResource resource = new SharedResource();

     Worker worker1 = new Worker(resource);
     Worker worker2 = new Worker(resource);

     worker1.setName("Worker-1");
     worker2.setName("Worker-2");

     worker1.start();
     worker2.start();

     // 4. Main Thread
     try {
         thread1.join();
         thread2.join();
         worker1.join();
         worker2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
     }

     System.out.println("Main thread finished execution.");
 }
}
