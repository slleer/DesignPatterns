class Kiosk extends Store {

    public Kiosk() {
        this.orderBehavior = new KioskOrder();
        this.paymentBehavior = new KioskPayment();
    }
}