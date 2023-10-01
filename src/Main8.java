import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);

                System.out.println("Hello! What is your age?");
                int age = scanner.nextInt();

                String activity;

                if (age < 6) {
                    activity = "Home, walk and kindergarten.";
                } else if (age >= 7 && age <= 17) {
                    activity = "School.";
                } else if (age >= 18 && age <= 22) {
                    activity = "University.";
                } else if (age > 23 && age <= 60) {
                    activity = "Work.";
                } else {
                    activity = "Retired.";
                }

                System.out.println("Based on your age, I suppose your daily activity is: " + activity);

    }
}
