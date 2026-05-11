//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestRate = caculateInterest(100, rate);
            if (interestRate > 9.75) {
                break;
            }
            System.out.println("100 rate " + rate + " % interest = " + interestRate);
        }

    }
    public static double caculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100 ));
    }
}