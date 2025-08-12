package station_pull;

public class AggApp extends Client {

    private double humidity;

    public AggApp(Subject subject) {
        super(subject);
        this.humidity = subject.getHumidity();
    }

    @Override
    public void update() {
        this.humidity = subject.getHumidity();
        System.out.println("AggApp updated");
    }
}
