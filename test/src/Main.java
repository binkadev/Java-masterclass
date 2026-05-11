public class Main {

    public static void main(String[] args) {

        double a = 20.00;
        double b = 80.00;
        double g = a + b * 100;
        System.out.println(g);

        System.out.println(g%40.00);

        boolean c;
        if (0.00 == (g%40.00)) {
            c = true;
        } else c = false;
        System.out.println(c);

        if (c != true) {
            System.out.println("got some remainder");
        }
    }
}