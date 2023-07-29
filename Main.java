import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.print("\n Enter a decimal number: ");
            double in1 = sc.nextDouble();

            System.out.print("\n Enter another decimal number: ");
            double in2 = sc.nextDouble();

            double res = 0;

            System.out.print("\n Enter preferred operation: \n 1. Addition \n 2. Subtraction \n 3. Division \n 4. Multiplication \n 5. Check Remainder \n");
            ch = sc.next().charAt(0);

            switch (ch) {
                case '1':
                    res = in1 + in2;
                    break;
                case '2':
                    res = in1 - in2;
                    break;
                case '3':
                    if (in2 != 0) {
                        res = in1 / in2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;
                case '4':
                    res = in1 * in2;
                    break;
                case '5':
                    if (in2 != 0) {
                        res = in1 % in2;
                    } else {
                        System.out.println("Cannot calculate remainder when divisor is zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n Enter Valid Input");
                    continue;
            }

            System.out.printf("\n Result: %.2f", res);
        } while (true); // Loop will continue until the user decides to exit explicitly.
    }
}
