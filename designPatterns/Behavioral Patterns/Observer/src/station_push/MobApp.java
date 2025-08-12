package station_push;

public class MobApp extends Client{

    private double pressure;

    public MobApp(){}

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.pressure = pressure;
        System.out.println("MobApp updated");
    }

}
