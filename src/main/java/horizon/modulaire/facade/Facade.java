package horizon.modulaire.facade;
import horizon.modulaire.brokering.Broker;
public class Facade {
    public static void main(String[] args) {
        Broker myBroker = new Broker();
        System.out.println("Price :" + myBroker.getShopingPrice("pc1007"));
    }
}
