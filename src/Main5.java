public class Main5 {
        public static void main(String[] args) {

                    int a = 10;
                    int b = 20;

                    // Using & (AND) operator
                    if (a > 5 && b > 5) {
                        System.out.println("Both a and b are greater than 5");
                    } else {
                        System.out.println("At least one of a and b is not greater than 5");
                    }

                    // Using || (OR) operator
                    if (a > 5 || b > 5) {
                        System.out.println("At least one of a and b is greater than 5");
                    } else {
                        System.out.println("Both a and b are not greater than 5");
                    }

                    // Using ! (NOT) operator
                    if (!(a > 5)) {
                        System.out.println("a is not greater than 5");
                    } else {
                        System.out.println("a is greater than 5");
                    }

    }

}

