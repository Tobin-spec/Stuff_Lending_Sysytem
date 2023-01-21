package model;

/**
 * The Item class.
 */
public class Item {
  private String name;
  private String description;
  private Integer dayOfCreation;
  private Integer costPerDay;
  private ItemType category;
  private Member owner;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void addDescription(String description) {
    this.description = description;
  }

  public Integer getDayOfCreation() {
    return this.dayOfCreation;
  }

  public Integer getCostPerDay() {
    return this.costPerDay;
  }
} 
