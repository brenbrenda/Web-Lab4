package horizon.modulaire.facade;

import horizon.modulaire.brokering.BrokerSetter;
import horizon.modulaire.negotiation.INegotiator;

import java.io.File;
import java.util.Scanner;
public class FacadeDdi {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String negoClassName = scanner.next();
            Class negotiatorClass = Class.forName(negoClassName);
            INegotiator negotiator = (INegotiator) negotiatorClass.newInstance();
            BrokerSetter myBroker = new BrokerSetter();
            myBroker.setNeg(negotiator);
            myBroker.setMargin(1.05);
            System.out.println("Price :" + myBroker.getShopingPrice("pc1007"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}