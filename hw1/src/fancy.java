class Fancy extends Store {

    public Fancy() {
        this.orderBehavior = new FancyOrder();
        this.paymentBehavior = new FancyPayment();
    }
}