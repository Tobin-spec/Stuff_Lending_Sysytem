package model;

import java.util.ArrayList;

/**
 * The class which stores all the interactions.
 */
public class MemberRegistry {
  private ArrayList<Member> memberList = new ArrayList<>();
  private Time time = new Time();
  private Integer today = time.getDay();

  /**
   * The method which will add a member which also checks if 
   * the email and the phone number is unique.
   */
  public void createMember(String name, String email, Integer number) {

    for (Member m : memberList) {
      if (!(m.getEmail().equals(email)) && !(m.getNumber() == number)) {
        Member member = new Member(name, email, number);
        member.setDayOfCreation(today);
        memberList.add(member);
      }
    }
  }

  /**
   * Adds item to a members item list. It also checks if the name fo the item is unique.
   */
  public void addItem(Member member, Item item) {
    for (Item i : member.getItemList()) {
      if (!(i.getName().equals(item.getName()))) {
        member.getItemList().add(item);
        member.incCredits(100);
      }
    }
  }

  public void deleteMember(Member member) {
    memberList.remove(member);
  }

  public void editMemberName(Member member, String name) {
    member.setName(name);
  }

  /**
   * Edit a member's email and also check if the email is unique.
   */
  public String editMemberEmail(Member member, String email) {
    String msg = "";
    for (Member m : memberList) {
      if (m.getEmail().equals(email)) {
        msg = "Email already taken.";
      } else {
        member.setEmail(email);
        msg = "Email updated successfully.";
      }
    }
    return msg;
  }

  /**
   * Edit a member's phone number if the given number is unique.
   */
  public String editMemberNumber(Member member, Integer number) {
    String msg = "";
    for (Member m : memberList) {
      if (m.getNumber() == number) {
        msg = "Number already taken.";
      } else {
        member.setNumber(number);
        msg = "Phone number updated successfully.";
      }
    }
    return msg;
  }
}

