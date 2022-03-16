abstract class Store {
    OrderBehavior orderBehavior;
    PaymentBehavior paymentBehavior;
    int orderNumber;

    public void newOrder() {
        this.orderNumber = orderBehavior.startOrder();
    }

    public void processPayment() {
        paymentBehavior.startPayment();
    }

    public int getOrderNumber() {
        return this.orderNumber;
    }
}