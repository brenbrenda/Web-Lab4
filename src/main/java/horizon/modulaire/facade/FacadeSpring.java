package horizon.modulaire.facade;//package horizon.modulaire.facade;
import horizon.modulaire.brokering.Broker;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FacadeSpring {
    public static void main(String[] args) {
        /* try {
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
        }*/
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
        Broker myBroker = (Broker) ctx.getBean("myBroker");
        System.out.println("Price :" + myBroker.getShopingPrice("pc1007"));
    }


}