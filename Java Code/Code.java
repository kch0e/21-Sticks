import java.util.Scanner;

class Main{
  
  public static void main(String[] args){
    //Declaring Variables
    
    //Keeps Track of Sticks
    int numSticks = 21;
    
    //Number of sticks player wants to take
    int numToTake;
    
    //input asks player if they'd like to go first.
    //Take takes number of sticks(1 or 2) player
    //wants to take
    Scanner input = new Scanner(System.in);
    Scanner take = new Scanner(System.in);
    
    //Asks player if they want to go first
    System.out.println("Would you like to go first? (Y/N)");
    String goFirst = input.nextLine();
    
    //Keeps game running until no
    //sticks are left in the virtual pile
    while(numSticks > 0){
      
      //Checks player respone for going first
      if(goFirst.equals ("y") || goFirst.equals ("Y") ){
        //Tells player how many sticks are left
        System.out.println("There are "+numSticks+" sticks left.");
        //Asks for input
        System.out.println("How many sticks do you want to take? (1 or 2)");
        //Takes input and takes from total amount
        numToTake = take.nextInt();
        //Makes sure players can't take nums
        //other than 1 or 2
        if(numToTake >= 2){
          numToTake = 2;
        }
        else if(numToTake<= 1){
          numToTake = 1;
        }
        numSticks -= numToTake;
        if(numToTake == 1){
          System.out.println("You take 1 stick.");
        }
        else{
          System.out.println("You take "+numToTake+" sticks.");
        }
        System.out.println("There are "+numSticks+" sticks left.");
        System.out.println();
        //This if statement will check to see if
        //the player took the last stick. If so, he loses.
        //If not, the game continues!
        if(numSticks <= 0){
          System.out.println("You lose!");
        }
        else{
      //Computer plays if game is not over
      
         //This is the computer logic
          if( (numSticks-2) % 3 == 0 || numSticks-2 == 0){
            numToTake = 1;
          }
          else{
            numToTake = 2;
          }
 
          if(numToTake == 1){
            System.out.println("Computer takes 1 stick.");
          }
          else{
           System.out.println("Computer takes "+numToTake+" sticks.");
          }
          
          numSticks = numSticks - numToTake;
          System.out.println();
          
          
        }//end of lose-check if-else
        
      }//Closes the if statement checking if player said "Y" or "y"
      else{

         //This is the computer logic
          if( (numSticks-2) % 3 == 0 || numSticks-2 == 0){
            numToTake = 1;
            System.out.println("Computer takes 1 stick.");
            numSticks--;
            System.out.println("There are "+numSticks+" sticks left.");
            System.out.println();
          }
          else{
            numToTake =2;
            
           System.out.println("Computer takes "+numToTake+" sticks.");
           numSticks -= numToTake;
           System.out.println("There are "+numSticks+" sticks left.");
           System.out.println();
          }
      
          System.out.println("There are "+numSticks+" sticks left.");
        //Asks for input
        System.out.println("How many sticks do you want to take? (1 or 2)");
        //Takes input and takes from total amount
        numToTake = take.nextInt();
        //Makes sure players can't take nums
        //other than 1 or 2
        if(numToTake >= 2){
          numToTake = 2;
        }
        else if(numToTake<= 1){
          numToTake = 1;
        }
        numSticks -= numToTake;
        if(numToTake == 1){
          System.out.println("You take 1 stick.");
        }
        else{
          System.out.println("You take "+numToTake+" sticks.");
        }
        System.out.println("There are "+numSticks+" sticks left.");
        System.out.println();
        //This if statement will check to see if
        //the player took the last stick. If so, he loses.
        //If not, the game continues!
        if(numSticks <= 0){
          System.out.println("You lose!");
        }
          
      }//End of else saying player said "no" or something else
      
      
    }//This bracket is the end of the while loop
    
  }//This bracket is the end of the main method
  
  
}//This bracket is the end of the Main class
