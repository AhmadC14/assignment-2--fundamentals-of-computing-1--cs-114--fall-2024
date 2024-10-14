import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates scanner object for user input

        // Requests an integer input and saves to variable input
        System.out.println("Enter a number:");
        int input = scanner.nextInt(); 

        // Checks if input is even or odd and directs to respective method
        if (input % 2 == 0) {
            drawEvenDiamond(input);
        } else {
            drawOddDiamond(input);
        }

        scanner.close();
    }

    // method to print shape respective to odd numbers
    public static void drawOddDiamond(int input) {
        int middle = input / 2; // calculates middle point of shape
        
        // top half of shape (including the middle row)
        for (int row = 0; row <= middle; row++) {
            // prints spaces to center "*" symbols
            for (int column = 0; column < middle - row; column++) {
                System.out.print(" ");
            }
            // prints "*" symbol for top half of shape
            for (int column = 0; column < (2 * row + 1); column++) {
                System.out.print("*");
            }
            System.out.println(); // for a new line after each row 
        }

        // bottom half of shape (excluding the middle row)
        for (int row = middle - 1; row >= 0; row--) {
            // prints spaces to center "*" symbols
            for (int column = 0; column < middle - row; column++) {
                System.out.print(" ");
            }
            // prints "*" symbol for top half of shape
            for (int column = 0; column < (2 * row + 1); column++) {
                System.out.print("*");
            }
            System.out.println(); // for a new line after each row 
        }
    }

    // method to print shape respective to even numbers
    public static void drawEvenDiamond(int input) {
        int middle = input / 2; // calculates middle point of shape

        // Prints the single top "*"
        for (int row = 1; row < middle; row++) {
            System.out.print("  ");
        }
        System.out.println(" * "); // Single "*" at the top
        
        // top half of shape
        for (int row = 1; row <= middle; row++) {
            // prints spaces to center "*" symbols
            for (int column = 0; column < middle - row; column++) {
                System.out.print("  ");
            }
            // prints "*" symbols with spaces between each
            for (int column = 0; column < row * 2; column++) {
                System.out.print("* ");
            }
            System.out.println(); // for a new line after each row 
        }

        // bottom half of shape        
        for (int row = middle - 1; row >= 1; row--) {
            // prints spaces to center "*" symbols
            for (int column = 0; column < middle - row; column++) {
                System.out.print("  ");
            }
            // prints "*" symbols with spaces between each
            for (int column = 0; column < row * 2; column++) {
                System.out.print("* ");
            }
            System.out.println(); // for a new line after each row 
        }

        // Prints the single bottom "*"
        for (int row = 1; row < middle; row++) {
            System.out.print("  ");
        }
        System.out.println(" * "); // Single "*" at the top
                
    }
}
