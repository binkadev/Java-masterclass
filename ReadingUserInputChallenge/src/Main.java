import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 5) {
            System.out.println("Enter Number #" + counter + " : ");
            String nextNumber = sc.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The Sum is: " + sum);
    }
}