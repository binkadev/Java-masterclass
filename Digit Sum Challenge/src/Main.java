//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        System.out.println("The sum of the digit =" + sumDigits(1234));
        System.out.println("The sum of the digit =" + sumDigits(12345));
        System.out.println("The sum of the digit =" + sumDigits(123));
        System.out.println("The sum of the digit =" + sumDigits(-123));

    }

    public static int sumDigits(int n) {

        if (n < 0) {
            return -1;
        }

        if (n < 10) {
            return n;
        }

        int sum = 0;

        while (n > 0) {

            sum += ( n % 10 );
            n = n / 10;
        }

        return sum;
    }

}