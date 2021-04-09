/** 
    * Class Assignment Computer Science 1400 
    * @author Sachin Chhetri <sachinchhetri202@gmail.com>
    * Use of Array, Loops, try/catch, and Conditions.  
    */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Cootie c = new Cootie();
        Scanner in = new Scanner(System.in);

        System.out.println("Cootie Catcher");
        
        // handling anykind of exception that the program might throw
        try{
            while (true){
                c.makeChoice();
                System.out.print("Do you want to continue? y/n : ");
                String quit = in.nextLine();
                if (quit.equalsIgnoreCase("n")){
                    break;
                }
                else if(quit.equalsIgnoreCase("y")){
                    continue;
                }
                else{
                    System.out.println("Sorry Invalid Input.");
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.println("Invalid Input. Try Again");
        }
        in.close();
    }   
}

