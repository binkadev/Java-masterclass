public class Main {
    public static void main(String[] args) {
        int primeCount = 0;

        for (int number = 2; primeCount < 3 && number <= 1000; number++) {
            if (isPrime(number)) {
                System.out.println(number);
                primeCount++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}