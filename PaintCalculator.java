import java.util.Scanner;
public class PaintCalculator {
    public static void main (String args[]) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("legnth?: ");
        double roomLegnth = sc.nextDouble();
        System.out.println("width?: ");
        double roomWidth = sc.nextDouble();
        System.out.println("height?: ");
        double roomHeight = sc.nextDouble();

        double roomArea = computeArea(roomLegnth, roomWidth, roomHeight);
        System.out.println("Area = " + roomArea);

        double gallonsNeeded = computeGallons(roomArea);
        System.out.println("Gallons needed = " + gallonsNeeded);

        double finalPrice = ((Math.ceil(gallonsNeeded)) * 32) ;
        System.out.println("Final price is = " + finalPrice);


        
        
    }

    public static double computeArea(double length, double width, double height) {
        // Write your code here
        //return(length * width * height);
        return(((length * height) + (width * height)) * 2);
        

        
    }
    public static double computeGallons(double area) {
        // Write your code here
        return(area / 350);
    }
}
