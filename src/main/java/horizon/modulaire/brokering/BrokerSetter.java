package horizon.modulaire.brokering;
import horizon.modulaire.negotiation.INegotiator;

public class BrokerSetter extends Broker {
    private INegotiator neg;
    private double margin;
    //Toc complete

    public void setNeg(INegotiator negotiator) {
        neg = negotiator;
    }

    public void setMargin(double value) {
        margin = value;
    }
}