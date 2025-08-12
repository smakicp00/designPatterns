package station_push;

public class MetStation extends Subject{

    private double temperature;
    private double humidity;
    private double pressure;

    public MetStation(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public double getPressure() {
        return pressure;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyClients(temperature, humidity, pressure);
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyClients(temperature, humidity, pressure);
    }
    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyClients(temperature, humidity, pressure);
    }

}
