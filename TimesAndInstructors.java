import java.util.*;
class TimesAndInstructors
{
    
    public static String[][] myArray = 
    { 
        {"CIS101", "Mon 9 am", "Farrell"},
        {"CIS210", "Mon 11 am", "Patel"},
        {"MKT100", "Tues 8:30 am", "Wong"},
        {"ACC150", "Tues 6 pm", "Deitrich"},
        {"CIS101", "Fri 1 pm", "Lennon"}
    };
        
    public static Scanner sc = new Scanner(System.in);
    
    public static int counter = 0;
    public static boolean isFound = false;
        
    
    public static void loopdeloop()
    {
        String temp;
        
        counter = 0;
        isFound = false;
        System.out.println("Enter number");
        temp = sc.nextLine();
        
            
            for (int i = 0; i < myArray.length; i++) 
            {
                if(temp.equals(myArray[i][0])) 
                {
                    counter = i;
                    System.out.println("Course: " + myArray[counter][0] + ", Time: " + myArray[counter][1] + ", Instructor: " + myArray[counter][2]); 
                    isFound = true;
                }
            }

            if(isFound == false)
            {
                System.out.println("Invalid Entry There is No Such Course");
                
                
                loopdeloop();
                
            }

    }
    public static void main(String[] args)
    {
        
        
        loopdeloop();
            
        
   }
   
}
