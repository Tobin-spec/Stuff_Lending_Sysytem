package model;

import java.util.ArrayList;
import java.util.UUID;

/**
 * The Member class.
 */
public class Member {
  private String name;
  private String email;
  private String phoneNumber;
  private String memberId;
  private ArrayList<Item> itemList = new ArrayList<Item>();
  private Integer dayOfCreation;
  private Integer credits;

  public Member() {
  }

  /**
   * Class Constructor for memeber.
   */
  public Member(String name, String email, String phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.memberId = UUID.randomUUID().toString().substring(0, 6);
  }

  public String getMemberId() {
    return this.memberId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNumber() {
    return phoneNumber;
  }

  public void setNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Integer getCredits() {
    return this.credits;
  }

  public void incCredits(Integer credits) {
    this.credits += credits;
  }

  public Integer getDayOfCreation() {
    return this.dayOfCreation;
  }

  public void setDayOfCreation(int day) {
    this.dayOfCreation = day;
  }
  
  ArrayList<Item> getItemList() {
    return itemList;
  }
}
