package view;

import java.util.Scanner;

/**
 * The class that is responsible for the main menu.
 */
public class MainMenu {
  Scanner scan = new Scanner(System.in);

  /**
   * The method that will display the main menu.
   */
  public void displayMainMenu() {
    System.out.println("Welcome to The Stuff Lending System.");
    System.out.println("Choose an Option by entering the corresponding number:");
    System.out.println("1. Create a Member.");
    System.out.println("2. View all the members");
  }

  public Integer getintInput() {
    return scan.nextInt();
  }

  public void createMember() {
    System.out.println("Enter name: ");
    System.out.println("Enter Email: ");
    System.out.println("Enter phone number: ");
  }
}
