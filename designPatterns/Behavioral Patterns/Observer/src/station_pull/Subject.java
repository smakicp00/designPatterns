package station_pull;

import java.util.ArrayList;

public abstract class Subject {

    private ArrayList<Client> clients = new ArrayList<Client>();

    public void attach(Client client){
        clients.add(client);
    }

    public void detach(Client client){
        clients.remove(client);
    }

    protected void inform(){
        for (Client client : clients){
            client.update();
        }
    }

    public abstract double getPressure();
    public abstract double getTemperature();
    public abstract double getHumidity();

}
