public class Main {

    public static void main(String[] args) {
	double purchaseCost = 15;
    double taxRate = 0.05;
    double purchaseTax = 0;
    purchaseTax = purchaseCost * taxRate;
    System.out.println("The sales cost of your " + purchaseCost + " purchase is " +purchaseTax);
    }
}
