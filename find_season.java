# assessment_FIS
import java.util.Scanner;

class Know_Season {
    private static boolean isSpring(int month) {
        return month >= 3 && month <= 5;
    }

    private static boolean isSummer(int month) {
        return month >= 6 && month <= 8;
    }

    private static boolean isAutumn(int month) {
        return month >= 9 && month <= 11;
    }

    private static boolean isWinter(int month) {
        return month == 1 || month == 2 || month == 12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        String s = "";

        System.out.println("Enter month number:");
        month = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number");
        } else {
            if (isSpring(month)) {
                s = "Spring";
            } else if (isAutumn(month)) {
                s = "Autumn";
            } else if (isSummer(month)) {
                s = "Summer";
            } else if (isWinter(month)) {
                s = "Winter";
            }

            System.out.println(month+"th month Season is :" + s);
        }

    }
}
