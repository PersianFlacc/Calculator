import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        System.out.println("Hello my Dear friend! It's your pocket calculator!");

        System.out.println("Choose what you want to do with these numbers" +
                "\n1 - (a+b)" +
                "\n2 - (a-b)" +
                "\n3 - (a*b)" +
                "\n4 - (a/b)" +
                "\n5 - (a%b)" +
                "\n6 - (sqrt(x)" +
                "\n7 - (pow(x,y))");

        Scanner sc = new Scanner (System.in);

        int knopka = sc.nextInt();

        switch (knopka) {
            case 1:

                System.out.println("Input first number: ");
                int a1 = sc.nextInt();

                System.out.println("Input second number: ");
                int a2 = sc.nextInt();

                System.out.println("Your answer: " + (a1+a2));
                break;
            case 2:

                System.out.println("Input first number: ");
                int b1 = sc.nextInt();

                System.out.println("Input second number: ");
                int b2 = sc.nextInt();

                System.out.println("Your answer: " + (b1-b2));
                break;
            case 3:

                System.out.println("Input first number: ");
                int c1 = sc.nextInt();

                System.out.println("Input second number: ");
                int c2 = sc.nextInt();

                System.out.println("Your answer: " + (c1*c2));
                break;
            case 4:

                System.out.println("Input first number: ");
                int d1 = sc.nextInt();

                System.out.println("Input second number: ");
                int d2 = sc.nextInt();

                if (d2 == 0) {
                    System.out.println("ERROR! You can't divide by 0!");
                }else{
                    System.out.println("Your answer: " + (d1 / d2));
                }
                break;
            case 5:

                System.out.println("Input first number: ");
                int d3 = sc.nextInt();

                System.out.println("Input second number: ");
                int d4 = sc.nextInt();

                System.out.println("Your answer: " + (d3 % d4));
                break;
            case 6:

                System.out.println("Input your number: ");
                int e = sc.nextInt();

                System.out.println("Your answer: " + Math.sqrt(e));
                break;
            case 7:

                System.out.println("Input first number: ");
                int f1 = sc.nextInt();

                System.out.println("Input second number: ");
                int f2 = sc.nextInt();

                System.out.println("Your answer: " + Math.pow(f1, f2));
        }

        sc.close();

        System.out.println("Thank you for taking advantage of my opportunities! " +
                "You can help the development of the project here:\n https://github.com/PersianFlacc/Calculator");
    }
}