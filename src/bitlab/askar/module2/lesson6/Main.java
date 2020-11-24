package bitlab.askar.module2.lesson6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        System.out.println("hello");

        ThreadGroup group = new ThreadGroup("group");

        MyThread thread = new MyThread(group,"thread1");
        MyThread thread2 = new MyThread(group,"thread2");
        MyThread thread3 = new MyThread(group,"thread3");

        thread.start();
        thread2.start();
        thread3.start();


        ArrayList<MyThread>threads = new ArrayList<>();
        threads.add(thread);
        threads.add(thread2);
        threads.add(thread3);

        ArrayList<MyThread> sortedThreads = new ArrayList<>();


        int acc = group.activeCount();
        while (group.activeCount()>0){

            if (group.activeCount()<acc){
                acc--;
                for (MyThread t:threads){
                    if (!t.isAlive()){
                        sortedThreads.add(t);
                    }
                }
            }

        }

        for (int i=0;i<5;i++){
            System.out.println("myu greind");
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("finished");


    }
}
