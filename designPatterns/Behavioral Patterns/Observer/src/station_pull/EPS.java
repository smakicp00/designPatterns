package station_pull;

public class EPS extends Client {

    private double temperature;

    public EPS(Subject subject) {
        super(subject);
        this.temperature = subject.getTemperature();
    }

    @Override
    public void update() {
        this.temperature = subject.getTemperature();
        System.out.println("EPS updated");
    }
}
