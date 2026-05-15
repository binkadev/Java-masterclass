public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("AGE = " + (currentYear - dateOfBirth));

        String usersAgeWithParticalYear =  " 22.5 ";

        double ageWithParticalYear = Double.parseDouble(usersAgeWithParticalYear);
        System.out.println("AGE = " + (ageWithParticalYear));
    }
}