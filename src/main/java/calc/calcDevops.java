package calc;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calcDevops {

    // res+choice-out

    private static final Logger logger = LogManager.getLogger(calcDevops.class);
    public static void displResult(double res) {

        System.out.println("\n==>Output is " + res);
    }

    public static double sqrRoot(double num) {
        double res;
        try{
            res = Math.sqrt(num);
            logger.info("Ans for sqr root: " + res);
            return res;
        }catch (Exception e){
            System.out.println(e);
            logger.info("Error in sqr root operation");
        }
        return 0;
    }

    public static long factorial(int num) {
        long res = 1;
        for (int i = num; i >= 2; i--)
            res = res * i;
        logger.info("Ans for factorial: " + res);
        return res;
    }

    public static double logarithm(Double num) {
        double res;
        try{
            res = Math.log(num);
            logger.info("Ans for factorial: " + res);
            return res;
        } catch(Exception e){
            System.out.println(e);
            logger.info("Error in factorial operation");
        }
        return 0;
    }

    public static double power(double base, double power) {
        double res;
        try{
            res = Math.pow(base, power);
            logger.info("Ans for power: " + res);
            return res;
        }catch (Exception e){
            System.out.println(e);
            logger.info("Error in power operation");
        }
        return 0;
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
                    logger.info("Number entered for square root: " + dnum);
                    try {
                        displResult(sqrRoot(dnum));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 2:
                    System.out.println("Enter a number for Factorial:");
                    inputNum = sc.nextInt();
                    logger.info("Number entered for factorial : " + inputNum);
                    displResult(factorial(inputNum));
                    break;

                case 3:
                    System.out.println("Enter a number for Log");
                    dnum = sc.nextDouble();
                    logger.info("Number entered for logarithm: " + dnum);

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
                    logger.info("Numbers entered as base and power for Power operation: " + base + power);

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
                    System.out.println("Invalid Option!");
                    logger.info("Invalid Option!");
                    break;
            }

        } while (choice != 0);

    }
}
