import java.util.Scanner;

public class calcDevops {

    // res+choice-out

    public static void displResult(double res) {
        System.out.println("\n==>Output is " + res);
    }

    public static double sqrRoot(Double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative!");
        } else {
            double res = Math.sqrt(num);
            return res;
        }
    }

    public static long factorial(int num) {
        long res = 1;
        for (int i = num; i >= 2; i--)
            res = res * i;
        return res;
    }

    public static double logarithm(Double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative!");
        } else {
            double res = Math.log(num);
            return res;
        }
    }

    public static double power(double base, double power) {
        double res = Math.pow(base, power);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, inputNum;
        double dnum;

        do {
            System.out.println("************************************************\n");
            System.out.println("...Devops Calculator...");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power function");
            System.out.println("0. Exit");
            System.out.println("\nChoose an operation: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a number for Square Root:");
                    dnum = sc.nextDouble();
                    try {
                        displResult(sqrRoot(dnum));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 2:
                    System.out.println("Enter a number for Factorial:");
                    inputNum = sc.nextInt();
                    displResult(factorial(inputNum));
                    break;

                case 3:
                    System.out.println("Enter a number for Log");
                    dnum = sc.nextDouble();

                    try {
                        displResult(logarithm(dnum));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("Enter the base number");
                    double base = sc.nextDouble();
                    System.out.println("Enter the power number");
                    double power = sc.nextDouble();

                    try {
                        displResult(power(base, power));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 0:
                    System.out.println("...Thank you for using Devops Calculator...");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }

        } while (choice != 0);

    }
}
