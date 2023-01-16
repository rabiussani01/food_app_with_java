import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("!!!FOOD APP!!!");
        System.out.println("Please create a pass-word");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();

        System.out.println("Your password is now : " + pass1);
        System.out.println("Please enter your password to continue :");
        String pass = scan.next();

        while (!pass.equals(pass1)){
            System.out.println("You entered a wrong password");
            System.out.println("Please enter the correct password to contnue");
            pass = scan.next();
        }
        System.out.println("***Welcome to The FOOD APP***");
        System.out.println("Let's make a order. Yes or No");
        String ans1 = scan.next();

        if (ans1.equals("yes")){
            System.out.println("Select a item between pizza,burger or kacchi");
            String ans2 = scan.next();

            while (!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("kacchi")){
                System.out.println("This item is not available");
                System.out.println("Please enter from pizza,burger or kacchi");
                ans2 = scan.next();
            }
            System.out.println("Your food is added in chart");
            System.out.println("will you love to add a drink? yes or no");
            String ans3 = scan.next();

            if (ans3.equals("yes")){
                System.out.println("Select a item between 7up,fanta or juice");
                String ans4 = scan.next();

                while (!ans4.equals("7up") && !ans4.equals("fanta") && !ans4.equals("juice")) {
                    System.out.println("This item is not available");
                    System.out.println("Please enter from 7up,fanta or juice");
                    ans2 = scan.next();
                }
                System.out.println("Your food is added in chart");
                System.out.println("To confirm your order, Please enter your password");
                String pass2 = scan.next();

                while (!pass2.equals(pass1)){
                    System.out.println("You entered a wrong password");
                    System.out.println("Please enter the correct password to contnue");
                    pass = scan.next();
                }
                System.out.println("*!Thank You for your order!*");

            }
            else {
                System.out.println("Alright! To confirm your order, Please enter your password :");
                String pass2 = scan.next();
                while (!pass2.equals(pass1)){
                    System.out.println("You entered a wrong password");
                    System.out.println("Please enter the correct password to contnue");
                    pass = scan.next();
                }
                System.out.println("*!Thank You for your order!*");
            }
        }
        else {
            System.out.println("Alright! Have a Good day Sir.");
        }

    }
}