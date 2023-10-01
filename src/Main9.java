import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);

                System.out.println("Hello! What is your name?");
                String name = scanner.nextLine();

                System.out.println("Hi " + name + "! How old are you?");
                int age = scanner.nextInt();

                System.out.println("What is your favorite book genre?");
                String genre = scanner.nextLine();

                String bookRecommendation;

                if (age >= 13 && age <= 16 && genre.equals("detective")) {
                    bookRecommendation = "The Curious Incident of the Dog in the Night-Time by Mark Haddon";
                } else if (age >= 17 && age <= 25 && genre.equals("non-fiction")) {
                    bookRecommendation = "Sapiens: A Brief History of Humankind by Yuval Noah Harari";
                } else {
                    bookRecommendation = "The Hitchhiker's Guide to the Galaxy by Douglas Adams";
                }

<<<<<<< HEAD
                System.out.println("I recommend the book " + bookRecommendation + " for  you.");
=======
                System.out.println("I recommend the book " + bookRecommendation + " for you.");
>>>>>>> origin/master
        }

    }
