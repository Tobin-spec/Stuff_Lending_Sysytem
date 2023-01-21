package controller;

public class MainMenu {

  public void controlMainMenu(model.MemberRegistry m, view.MainMenu v) {
    v.displayMainMenu();
    Integer inp = v.getintInput();
    switch (inp) {
      case 1:
        v.createMember();
        m.createMember(null);
        break;
    
      default:
        break;
    }
  }
}
