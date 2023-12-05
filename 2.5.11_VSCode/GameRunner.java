/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim 
*/

//import statements
import java.util.Scanner;

public class GameRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Game of Nim!");

    //Board.populate(); // static method call
    
    Game nim = new Game(); //create game object
    boolean go = true; // create boolean variable for while loop expression
    Scanner sc = new Scanner(System.in); // Scanner for user input
    nim.play(); // run nim game once

    //play again loop
    while (go) {
      //play again option
      System.out.println("-------------------------------------------");
      System.out.println("NOTE: Invalid input will lead to game end and score lost.");
      System.out.println("Would you like to play again? Enter y or n: ");
      String choice = sc.next(); // gets user choice
      if (choice.equals("y")) {
          nim.play(); // run game again
      } else { // ends code
      }
    }
    sc.close(); //close scanner
  }
}