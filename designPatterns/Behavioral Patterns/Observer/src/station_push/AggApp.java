package station_push;

public class AggApp extends Client{

    private double humidity;

    public AggApp(){}

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.humidity = humidity;
        System.out.println("AggApp updated");
    }

}
