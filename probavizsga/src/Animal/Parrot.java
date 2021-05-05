package Animal;

public class Parrot extends Animal {
  public Parrot(String ownername, boolean isHealty, int healCost, String name) {
    super(ownername, isHealty, healCost, name);
  }

  public Parrot(String ownername, boolean isHealty, int healCost) {
    super(ownername, isHealty, healCost);
  }

  public void parrotHealingCost() {
    super.parrotHealCost();
  }
}
