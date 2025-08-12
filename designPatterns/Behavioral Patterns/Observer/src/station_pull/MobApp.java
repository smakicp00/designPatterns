package station_pull;

public class MobApp extends Client {

    private double pressure;

    public MobApp(Subject subject) {
        super(subject);
        this.pressure = subject.getPressure();
    }

    @Override
    public void update() {
        this.pressure = subject.getPressure();
        System.out.println("MobApp updated");
    }
}
