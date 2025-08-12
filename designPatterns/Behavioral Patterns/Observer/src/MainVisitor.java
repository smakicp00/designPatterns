import station_pull.AggApp;
import station_pull.EPS;
import station_pull.MetStation;
import station_pull.MobApp;


public class MainVisitor {
    public static void main(String[] args) {
        //testStationPull();
        testStationPush();
    }

    public static void testStationPush(){
        station_push.MetStation metStation = new station_push.MetStation(20, 50, 1000);
        station_push.EPS eps = new station_push.EPS();
        station_push.AggApp aggApp = new station_push.AggApp();
        station_push.MobApp mobApp = new station_push.MobApp();
        metStation.register(mobApp);
        metStation.register(aggApp);
        metStation.register(eps);
        metStation.setTemperature(10);
        metStation.setHumidity(50);
        metStation.setPressure(1000);
    }

    public static void testStationPull() {
        MetStation metStation = new MetStation(20, 50, 1000);
        EPS eps = new EPS(metStation);
        MobApp mobApp = new MobApp(metStation);
        AggApp aggApp = new AggApp(metStation);
        metStation.attach(eps);
        metStation.attach(aggApp);
        metStation.attach(mobApp);
        metStation.setTemperature(10);
        metStation.setHumidity(50);
        metStation.setPressure(1000);
        //eps.update();
    }
}
