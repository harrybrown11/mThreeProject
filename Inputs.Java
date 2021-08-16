import java.util.Scanner;

public class Inputs {
	public static void main(String [] args) {
        // declare variables
        float height;
        float width;
        float windowCost;
        float trimCost;
        int numWindows;

        // declare String variables to hold the user's height and
        // width input
        String stringHeight;
        String stringWidth;
        String stringwindowCost;
        String stringtrimCost;
        String stringnumWindows;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter window material cost: ");
        stringwindowCost = myScanner.nextLine();
        System.out.println("Please enter trim material cost: ");
        stringtrimCost = myScanner.nextLine();
        System.out.println("Please enter amount of windows: ");
        stringnumWindows = myScanner.nextLine();

        // convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        windowCost = Float.parseFloat(stringwindowCost);
        trimCost = Float.parseFloat(stringtrimCost);
        numWindows = Integer.parseInt(stringnumWindows);

        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // calculate the total cost - use a hard-coded value
        // for material cost
        cost = ((windowCost * areaOfWindow) + (trimCost * perimeterOfWindow));

        // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Number of windows = " + numWindows);
        System.out.println("Total Cost =  " + (cost * numWindows));
    }
}