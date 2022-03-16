class KioskOrder implements OrderBehavior {
    public int startOrder() {
        System.out.println("Please enter a order number: ");
              
        return inputClass.scanner.nextInt();
    }
}
