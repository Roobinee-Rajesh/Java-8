package org.example.Generic;
class TaskThread extends Thread {
    public void run() {
        System.out.println("Task 2 Start");
        for(int i=1;i<200;i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Task 2 End");
    }

}

class TaskRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Task 1 Start");
        for(int i=1;i<200;i++){
            System.out.println(i+" ");
        }
        System.out.println("");
        System.out.print("Task 1 End");
    }
}
public class B_Thread {
    public static void main(String[] args) {
        TaskThread taskThread=new TaskThread();
        taskThread.start();
        TaskRunnable taskRunnable=new TaskRunnable();
        Thread thread=new Thread(taskRunnable);
        thread.start();

        System.out.println("Task 3 Start");
        for(int i=1;i<200;i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Task 3 End");
    }
}
