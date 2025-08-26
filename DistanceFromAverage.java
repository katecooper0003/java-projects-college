import java.util.*;
public class DistanceFromAverage {
    public static void main (String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        double[] nums = new double[15];
        boolean quit = false;
        int counter = 0;
        double sum = 0;
        while (quit == false){
            System.out.println("Enter number (99999 to quit)");
            
            double recentNum = sc.nextDouble();
            if (recentNum == 99999 || counter > 15){
                quit = true;
            }
            else{
                nums[counter] = recentNum;
                sum = sum + recentNum;
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("ERROR");
        }
        else{
            double average = sum / (counter);
            System.out.println("You entered " + counter + " numbers and thier average is " + average);
            for (int i = 0; i < counter; i++){
                double localAvgDistance = nums[i] - average;
                System.out.println(nums[i] + " is " + localAvgDistance + " away from the average");
            }
        }
        

    }
}
