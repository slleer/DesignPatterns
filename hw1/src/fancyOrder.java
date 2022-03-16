class FancyOrder implements OrderBehavior {
    int orderNumber;

    FancyOrder() {
        orderNumber = 0;
    }

    public int startOrder() {
        return ++orderNumber;
    }
}
