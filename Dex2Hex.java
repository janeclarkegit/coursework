import java.util.Scanner;

class Dex2Hex {

    public static void main(String args[]) {
        // Check for missing input
        if (args.length == 0) {
            System.err.println("Error: No input provided. Please provide a decimal input.");
            System.exit(1); // Exit with an error code
        }

        // Process the input
        try {
            int num = Integer.parseInt(args[0]);
            convertAndPrintHexadecimal(num);
        } catch (NumberFormatException e) {
            System.err.println("Error: Provided input is not a valid integer.");
            System.exit(1); // Exit with an error code
        }
    }

    public static void convertAndPrintHexadecimal(int num) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";

        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
