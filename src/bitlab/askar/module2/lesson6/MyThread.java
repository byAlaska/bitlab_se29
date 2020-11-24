package bitlab.askar.module2.lesson6;

public class MyThread extends Thread {


    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {

        synchronized (this){
            for (int i=0;i<5;i++){
                System.out.println("my friend ->"  + getName());
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        System.out.println("finished");
    }
}
