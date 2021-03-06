package game;

import java.util.Scanner;

public class Menu {

  public static void main(String[] args){
    Menu m = new Menu();
    m.displayMenu();
    m.promptUserInput();
  }

  public void displayMenu(){
    System.out.println("Welcome to the Nubmer Guessing Game!");
    System.out.println("Type 1 to start a new game");
    System.out.println("Type 2 to choose maximum number");
    System.out.println("Type 3 to get bio of developer");
    System.out.println("Type 4 to quit game");
  }

  public void promptUserInput(){
    System.out.print("Please enter your selection: ");
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    int maximum = 1000;
    try{
      choice = scan.nextInt();
      if(choice == 1){
        GuessingGameLogic gg = new GuessingGameLogic(scan, maximum);
        gg.guessingGame();
      }else if(choice == 2){
    	  System.out.print("Please enter Maximum: ");
    	  maximum = scan.nextInt();
    	  GuessingGameLogic gg = new GuessingGameLogic(scan, maximum);
          gg.guessingGame();
      }else if(choice == 3){
    	  System.out.println("Ahadu Yeheyis");
      }else if(choice == 4) {
    	  System.exit(0);
      } else{
        printErrorMessage();
      }
    }catch (IllegalStateException e){
      printErrorMessage();
    }
  }

  public void printErrorMessage(){
    System.err.println("Invalid input. Please start again.");
  }
}