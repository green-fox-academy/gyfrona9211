package Animal;

public class Dog extends Animal{

    public Dog(String ownername, boolean isHealty, int healCost, String name) {
        super(ownername, isHealty, healCost, name);
    }

    public Dog(String ownername, boolean isHealty, int healCost) {
        super(ownername, isHealty, healCost);
    }
    public void healingCostDog(){
        super.dogHealCost();
    }
}
