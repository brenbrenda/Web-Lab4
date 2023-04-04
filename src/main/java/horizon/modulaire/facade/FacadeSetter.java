package horizon.modulaire.facade;

import horizon.modulaire.brokering.BrokerSetter;
import horizon.modulaire.negotiation.INegotiator;
import horizon.modulaire.negotiation.Negotiator;

public class FacadeSetter  {
    public static void main(String[] args) {
        INegotiator negotiator = new Negotiator();
        BrokerSetter myBroker = new BrokerSetter();
        myBroker.setNeg(negotiator);
        myBroker.setMargin(1.05);
        System.out.println("Price :" + myBroker.getShopingPrice("pc1007"));
    }
}

