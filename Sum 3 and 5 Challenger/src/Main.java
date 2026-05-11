public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int number = 1; number <= 1000; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
                sum += number;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}