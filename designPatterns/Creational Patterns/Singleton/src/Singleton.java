public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from Singleton instance");
    }
}
