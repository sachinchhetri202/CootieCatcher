import java.util.*;

public class Cootie{
   Scanner in = new Scanner(System.in);
   Random rand = new Random();
   
   String[] fortunes = {"Most Likely", "Likely", "Positively Not", "Positively Yes", "Absolutely Not", "Absolutely Yes", "Just Pray God", "Never in this life"};
   
   public void makeChoice(){
      int num = 0;
      System.out.print("Choose a color(red, yellow, green, blue): "); // user chooses a color
      in.next();
      String color = in.nextLine(); // stores the color that the user entered 
      color = color.replaceAll(" ", "");
      int len = color.length(); 
      
      if (len % 2 == 0){
         System.out.print("Choose a number(1, 2, 5, 6): ");
         num = in.nextInt();
         if (num != 1 && num != 2 && num != 5 && num != 6){
            do{
               System.out.println("Sorry this is not an option.");
               System.out.print("Choose a number(1, 2, 5, 6): ");
               num = in.nextInt();
            }while(num != 1 && num != 2 && num != 5 && num != 6);
         }
      }
      else {
         System.out.print("Choose a number(3, 4, 7, 8): ");
         num = in.nextInt();
         if (num != 3 && num != 4 && num != 7 && num != 8){
            do{
               System.out.println("Sorry that is not an option.");
               System.out.print("Choose a number(3, 4, 7, 8): ");
               num = in.nextInt();
            }while(num != 3 && num != 4 && num != 7 && num != 8);
         } 
      }
      

      System.out.print("Cootie says: ");
      switch(num){
         case 1 -> System.out.println(fortunes[0]);
         case 2 -> System.out.println(fortunes[1]);
         case 3 -> System.out.println(fortunes[2]);
         case 4 -> System.out.println(fortunes[3]);
         case 5 -> System.out.println(fortunes[4]);
         case 6 -> System.out.println(fortunes[5]);
         case 7 -> System.out.println(fortunes[6]);
         case 8 -> System.out.println(fortunes[7]);
      }
         
   }

} 