package station_pull;

public abstract class Client {

    protected Subject subject;

    public Client(Subject subject) {
        this.subject = subject;
        //subject.attach(this);
    }

    public abstract void update();
}
