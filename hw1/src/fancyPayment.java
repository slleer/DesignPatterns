class FancyPayment implements PaymentBehavior {
    public void startPayment() { 
        System.out.println("1) Cash\n2) Credit Card");
        int paymentChoice = inputClass.scanner.nextInt();
        if (paymentChoice == 1) {
            cashPayment();
        } else if(paymentChoice == 2){
            System.out.println("Cost of order: ");
            float totalCost = inputClass.scanner.nextFloat();
            System.out.println("Please enter credit card number: ");
            inputClass.scanner.nextLine();
            String creditCardNumber = inputClass.scanner.nextLine();
            System.out.println("$" + totalCost + " is being charged to customer's credit card: " + creditCardNumber);
            System.out.println("Credit Card payment successful.");
        } else {
        	System.out.println("INVALID CHOICE");
        	startPayment();
        }
                
    }
}