import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Select Operations
        Scanner operator = new Scanner(System.in);
        String confirmOp;

        System.out.println("[1] => Addition");
        System.out.println("[2] => Subtraction");
        System.out.println("[3] => Multiplication");
        System.out.println("[4] => Division");

        confirmOp = operator.nextLine();

        // Addition
        if ("1".equals(confirmOp)) {
            Scanner add1 = new Scanner(System.in);
            Scanner add2 = new Scanner(System.in);

            System.out.println("Enter two values: ");

            int val1 = add1.nextInt();
            int val2 = add2.nextInt();
            int sum = val1 + val2;

            System.out.println("Your sum is " + sum);
        }

        // Subtraction
        if ("2".equals(confirmOp)) {
            Scanner sub1 = new Scanner(System.in);
            Scanner sub2 = new Scanner(System.in);

            System.out.println("Enter two values: ");

            int val1 = sub1.nextInt();
            int val2 = sub2.nextInt();
            int remainder = val1 - val2;

            System.out.println("Your remainder is " + remainder);
        }

        // Multiplication
        if ("3".equals(confirmOp)) {
            Scanner mul1 = new Scanner(System.in);
            Scanner mul2 = new Scanner(System.in);

            System.out.println("Enter two values: ");

            int val1 = mul1.nextInt();
            int val2 = mul2.nextInt();
            int product = val1 * val2;

            System.out.println("Your product is " + product);
        }

        // Division
        if ("4".equals(confirmOp)) {
            Scanner div1 = new Scanner(System.in);
            Scanner div2 = new Scanner(System.in);

            System.out.println("Enter two values: ");

            int val1 = div1.nextInt();
            int val2 = div2.nextInt();
            int quotient = val1 / val2;

            System.out.println("Your quotient is " + quotient);
        }
    }
}
