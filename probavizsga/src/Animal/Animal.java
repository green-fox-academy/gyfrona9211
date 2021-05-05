package Animal;

public class Animal {

  private String ownername;
  private boolean isHealty;
  private int healCost;
  private String name;

  public Animal(String ownername, boolean isHealty, int healCost, String name) {
    this.ownername = ownername;
    this.isHealty = isHealty;
    this.healCost = healCost;
    this.name = name;
  }

  public Animal(String ownername, boolean isHealty, int healCost) {
    this.ownername = ownername;
    this.isHealty = isHealty;
    this.healCost = healCost;
    this.name = this.getClass().getName();
  }

  public void heal() {

    this.isHealty = true;
  }

  public boolean isAdoptable() {

    return isHealty;
  }

  @Override
  public String toString() {
    if (isAdoptable()) return this.name + " is not healthy (" + healCost + "€), and not adoptable";
    return this.name + " is healthy, and adoptable";
  }

  public void catHealCost() {
    this.healCost = 4;
  }

  public void dogHealCost() {
    this.healCost = 7;
  }

  public void parrotHealCost() {
    this.healCost = 5;
  }
}
