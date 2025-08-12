package station_pull;

public class MetStation extends Subject {

    private double temperature;
    private double humidity;
    private double pressure;

    public MetStation(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public double getHumidity() {
        return humidity;
    }

    @Override
    public double getPressure() {
        return pressure;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyClients();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyClients();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyClients();
    }

    @Override
    public String toString() {
        return "MetStation{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    public void notifyClients() {
        inform();
    }
}
