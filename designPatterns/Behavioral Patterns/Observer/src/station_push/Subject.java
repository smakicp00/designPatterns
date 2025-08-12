package station_push;

import java.util.ArrayList;

public abstract class Subject {

    private ArrayList<Client> clients = new ArrayList<Client>();
    public void register(Client client){
        clients.add(client);
    }
    public void unregister(Client client){
        clients.remove(client);
    }
    public void notifyClients(double temp, double humidity, double pressure){
        for (Client client : clients){
            client.update(temp, humidity, pressure);
        }
    }
}
