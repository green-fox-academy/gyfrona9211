package Animal;

public class Cat extends Animal {

  public Cat(String ownername, boolean isHealty, int healCost, String name) {
    super(ownername, isHealty, healCost, name);
  }

  public Cat(String ownername, boolean isHealty, int healCost) {
    super(ownername, isHealty, healCost);
  }

  public void healingCostCat() {
    super.catHealCost();
  }
}
