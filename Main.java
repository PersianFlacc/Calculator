import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        System.out.println("Hello my Dear friend! It's your pocket calculator!");

        System.out.println("To get started, enter button 1");

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        System.out.println("Input your first number: ");

        int n1 = sc.nextInt();

        System.out.println("Input your second number ");
        
        int n2 = sc.nextInt();

        System.out.println("Choose what you want to do with these numbers ");
        System.out.println("1 - (a+b)");
        System.out.println("2 - (a-b)");
        System.out.println("3 - (a*b)");
        System.out.println("4 - (a/b)");
        System.out.println("5 - (a%b)");

        int knopka = sc.nextInt();

        switch (knopka) {
            case 1:
                System.out.println("Your numbers: " + (n1+n2));
                break;
            case 2:
                System.out.println("Your numbers: " + (n1-n2));
                break;
            case 3:
                System.out.println("Your numbers: " + (n1*n2));
                break;
            case 4:
                System.out.println("Your numbers: " + (n1/n2));
                break;
            case 5:
                System.out.println("Your numbers: " + (n1%n2));
                break;
        }

        sc.close();

        System.out.println("Thank you for taking advantage of my opportunities! " +
                "You can help the development of the project here:\n https://github.com/PersianFlacc/Calculator");
    }
}