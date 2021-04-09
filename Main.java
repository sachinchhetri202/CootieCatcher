import java.util.*;

public class Main{
   
   public static void main(String[] args){
      Cootie c = new Cootie(); // another Class
      Scanner in = new Scanner(System.in);
      
      System.out.println("Cootie Catcher");
      
      try{
         while(true){
            System.out.print("Ask your Cootie Catcher a question: ");
            String a = in.nextLine(); // user enters the question
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
      catch (Exception e){
         System.out.println("Invalid Input. Try Again.");
      }
      in.close();  
   }
}