import java.util.Scanner;

public class WindowMaster {

    public static void main(String [] args) {
        // declare variables for height and width


        String stringHeight = null;
        String stringWidth = null;
        float height = 0F;
        float width = 0F;
        float costOfWindow = 0F;
        int numberOfwindows = 0;


        float perimeterOfWindow = 0.0F;

        String stringcostOfWindow;
        String stringnumberOfWindows;

        Scanner myScanner = new Scanner(System.in);
        boolean isValid = false;
        do {
            try{
                System.out.println("Please enter window height:");
                stringHeight = myScanner.nextLine();
                height = Float.parseFloat(stringHeight);
                isValid = true;
            }  catch(NumberFormatException ex){
                System.out.println("invalid height");
            }
        } while(!isValid);

        isValid = false;
        do {
            try{
                System.out.println("Please enter window width:");
                stringWidth = myScanner.nextLine();
                width = Float.parseFloat(stringWidth);
                isValid = true;
            }  catch(NumberFormatException ex){
                System.out.println("invalid width");
            }
        } while(!isValid);

        isValid = false;
        do {
            try{
                System.out.println("Please enter cost of windows:");
                stringcostOfWindow = myScanner.nextLine();
                costOfWindow = Float.parseFloat(stringcostOfWindow);
                isValid = true;
            }  catch(NumberFormatException ex){
                System.out.println("invalid cost");
            }
        } while(!isValid);

        isValid = false;
        do {
            try{
                System.out.println("Please enter number of windows:");
                stringnumberOfWindows = myScanner.nextLine();
                numberOfwindows = Integer.parseInt(stringnumberOfWindows);
                isValid = true;
            }  catch(NumberFormatException ex){
                System.out.println("invalid cost");
            }
        } while(!isValid);


        // convert String values of height and width to float values

        float cost = numberOfwindows * costOfWindow;

        float areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // calculate the total cost - use a hard-coded value
        // for material cost
        //Float cost = costOfWindow * numberOfWindows;

        // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
    }
}

