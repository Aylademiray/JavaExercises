package day32.homework;

public class HW1 {
    // write java program with method buyItem
    // that accepts argument
    // which lets you buy items from store
    // prints items bought in store
    // ex: I go to store and bought a milk
    // ex: I go to store and bought a water
    // ex: I go to store and bought a sugar

    public static void main(String[] args) {

        buyItem("milk");
        buyItem("water");
        buyItem("sugar");
        buyItem("tea");

    }

    public static String  buyItem (String input) {
        System.out.println("I go to store and bought input " + input);
        return "I go to store and bought input " + input;
    }
}
