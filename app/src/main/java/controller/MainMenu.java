package controller;

import model.MemberRegistry;

public class MainMenu {

  private MemberRegistry registry;  
  public void controlMainMenu(model.MemberRegistry m, view.MainMenu v) {
    v.displayMainMenu();
    Integer inp = v.getintInput();
    while (inp != 3) {
      switch (inp) {
        case 1:
          v.createMember();
          break;
        case 2:
          v.showallMembers();
          break;
        default:
          break;
      }
    }
  }

  public void createMember(String name, String email, String number) {
    registry.createMember(name, email, number);
  }

  public String listAllMembersSimple() {
    return registry.listAllMembers();
  }
}