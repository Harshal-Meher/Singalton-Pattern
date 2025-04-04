public class Singleton {

    private volatile static Singleton instance;

    private Singleton(){

    }

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void DisplayMsg() {
        System.out.println("Display Message");
    }
}
