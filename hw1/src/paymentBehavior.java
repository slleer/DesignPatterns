interface PaymentBehavior {
    public void startPayment();

    public default void cashPayment(){
        System.out.println("Cost of order: ");
        float totalCost = inputClass.scanner.nextFloat();
        System.out.println("Payment recieved from customer: ");
        float totalPaid = inputClass.scanner.nextFloat();
        while(totalPaid < totalCost) {
        	System.out.println("Insufficent payment, customer still owes: " + (totalCost-totalPaid) + 
        			"\n Additional money from customer: ");
        	totalPaid += inputClass.scanner.nextFloat();
        }
        System.out.printf("Change due: %.2f\n", (totalPaid-totalCost));    
    }
}