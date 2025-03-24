public class Main {
    public static void main(String[] args) {
        Singleton.DisplayMsg();

        //Singleton Object
        Singleton obj  = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());



        Runnable task = () -> {
            Singleton.getInstance().DisplayMsg();
        };
        Thread thread = new Thread(task);
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread.start();
        thread1.start();
        thread2.start();

        try {
            thread.join();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}