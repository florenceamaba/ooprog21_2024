class Billing {
    public void computeBill(double price) {
        double total = price + (price * 0.08);
        System.out.println("The Total price for the bill is: $" + total);
    }
    public void computeBill(double price, int quantity) {
        double total = (price * quantity) + ((price * quantity) * 0.08);
        System.out.println("The Total price for the bill is : $" + total);
    }
    public void computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = (price * quantity);
        double discountAmount = (subtotal * couponDiscount / 100);
        double total = (subtotal - discountAmount) + ((subtotal - discountAmount) * 0.08);
        System.out.println("The Total price for the bill is: $" + total);
    }
    
    public static void main(String[] args) {
        Billing billing = new Billing();
        billing.computeBill(23.2); 
        billing.computeBill(23.2, 3); 
        billing.computeBill(23.2, 3, 10);
    }
}
