package horizon.modulaire.brokering;

import horizon.modulaire.negotiation.INegotiator;
import horizon.modulaire.negotiation.Negotiator;
public class Broker {
    private INegotiator neg;
    private double margin;
    public Broker() {
        neg = new Negotiator();
        margin = 1.07;
    }
    public double getShopingPrice(String ref) {
        return margin*neg.getStorePrice(ref);
    }
}
