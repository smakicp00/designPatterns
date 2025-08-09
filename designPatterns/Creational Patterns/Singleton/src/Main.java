import java.security.Signature;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.showMessage();
        singleton2.showMessage();
    }
}
