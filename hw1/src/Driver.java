
public class Driver {
    public static void main(String[] args) {
        Store kiosk = new Kiosk();
        Store fancy = new Fancy();

        kiosk.newOrder();
        System.out.println("Order Number: " + kiosk.getOrderNumber());
        kiosk.processPayment();

        fancy.newOrder();
        System.out.println("Order Number: " + fancy.getOrderNumber());
        fancy.processPayment();
        
        inputClass.closeScanner();
    }
}














