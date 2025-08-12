package station_push;

public class EPS extends Client{

    private double temperature;

    public EPS(){}

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        System.out.println("EPS updated");
    }

}
