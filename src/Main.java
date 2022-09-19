import java.io.*;

public class Main {


    public static void main(String[] args) {

        //int declarations
        int intOperandA = 23;
        int intOperandB = 8;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        //double declarations
        double doubleOperandA = 27.3;
        double doubleOperandB = 14.19;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        //int operations
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        // double operations
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("\nThe sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);

        // part 2 declarations
        int numKids = 1;
        String isRaining = "Nope.";
        double gasPrice = 4.28;
        int favNum = 23;
        double shoeSize = 12.5;
        String birthMonth = "November";
        String fullName = "Joshua D. Krempasky";

        System.out.println("\nThere is " + numKids + " kid in my family.");
        System.out.println("Is it raining? " + isRaining);
        System.out.println("The price of gas is currently " + gasPrice);
        System.out.println("My favorite number is " + favNum);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("My full name is " + fullName);
    }
}