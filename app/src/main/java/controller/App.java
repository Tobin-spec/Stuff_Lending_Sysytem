package controller;

/**
 * Responsible for staring the application.
 */
public class App {
  /**
   * Application starting point.

   * @param args command line arguments.
   */
  public static void main(String[] args) {
    // adapt to start the application in your way
    model.MemberRegistry m = new model.MemberRegistry();
    MainMenu c = new MainMenu();
    view.MainMenu v = new view.MainMenu();

    c.controlMainMenu(m, v);
  }
}
