public class Main {
    public static void main(String[] args) {

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was a 3, a 4, or a 5");
                System.out.println("No la " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        String month = "Mar";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter ");
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "Jan", "Feb", "Mar" -> {
                yield "Jan";
            }
            case "Apr", "May", "Jun" -> "2nd";
            case "Jul", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
            default -> {
                String badResponse = month + " is bad ";
                yield badResponse;
            }
        };
    }
}