package view;

import java.util.Scanner;

/**
 * The class that is responsible for the main menu.
 */
public class MainMenu {
  private Scanner scan = new Scanner(System.in);
  private controller.MainMenu controller;

  /**
   * The method that will display the main menu.
   */
  public void displayMainMenu() {
    System.out.println("Welcome to The Stuff Lending System.");
    System.out.println("Choose an Option by entering the corresponding number:");
    System.out.println("1. Create a Member.");
    System.out.println("2. View all the members");
    System.out.println("3. Quit ");
  }

  public Integer getintInput() {
    return scan.nextInt();
  }

  public void createMember() {
    System.out.println("Enter name: ");
    String name = scan.nextLine();
    System.out.println("Enter Email: ");
    String email = scan.nextLine();
    System.out.println("Enter phone number: ");
    String number = scan.nextLine();
    controller.createMember(name, email, number);
  }

  public void showallMembers() {
    System.out.println(controller.listAllMembersSimple());
  }
}
