import java.util.Scanner;

class Main {
    Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your first number: ");
        int n1 = sc.nextInt();
        System.out.println("Input your second number");
        int n2 = sc.nextInt();
        int o1 = n1 + n2;
        int o2 = n1 - n2;
        int o3 = n1 * n2;
        int o4 = n1 / n2;
        System.out.printf("Your answers: %d, %d, %d, %d", o1, o2, o3, o4);
        sc.close();
    }
}