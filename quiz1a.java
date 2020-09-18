import javax.swing.JOptionPane;
public class MIS3370SpringQuiz1A
{
    public static void main(String args[])
    {
        double enteredBudget;

        enteredBudget = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Budget Amount for the Bathroom Remodel"));
        System.out.println("The budget for The Bathroom Remodel $" + enteredBudget);
        System.out.println("Material \t\tCost\t\tTotal Cost \tRemaining");

        final BuildingMaterial budget = new BuildingMaterial(enteredBudget);

        final BuildingMaterial purchase1 = new BuildingMaterial();
        displayPurchases(purchase1);

        final BuildingMaterial purchase2 = new BuildingMaterial();
        displayPurchases(purchase2);

        JOptionPane.showMessageDialog(null, "please enter revised price for this object");
        purchase2.reviseMaterialCost();
        purchase2.displayPurchase("R");

        BuildingMaterial.MoneyRemainingInBudget();
    }
    public static void displayPurchases(final BuildingMaterial item)
    {
        item.displayPurchase();
    }
}

import.javax.swing.JOptionPane;
public class BuildingMaterial
{
    private static final double taxRate = .085; // FIXED TAX RATE
    private static double initialBudget; // BUDGET AMOUNT
    private static double totalPurchases; // Total Purchase Amount (including tax)
    private final String materialName; // Name of material purchased
    private double materialCost; // Item purchase amount (not including tax)
    private double finalCost; // Calculated item purchase amount (including tax)

    // Class 1 - 1a ... one parameter .. constructor
    pubilc BuildingMaterial( double budget)
    {
        BuildingMaterial.initialBudget = budget;
    }

    //Class 1 - 2 ... no parameter .. constructor
    public BuildingMaterial()
    {
        materialName = JOptionPane.showInputDialog(null, "What materials did you purchase?"); // 1-2a
        materialCost = Double.parseDouble(JOptionPane.showInputDialog(null," How much did" + materialName + " cost?")); //1-2b
        finalCost = materialCost * (1 + taxRate); //1-2cde .... calculate tax rate of specific material
        totalPurchases = totalPurchases + finalCost; //1-2cde .... add new tax rate
    }

    //Class 1 - 3 .. no parameter
    public void reviseMaterialCost()
    {
        totalPurchases = totalPurchases - finalCost; //1-3a
        materialCost = Double.parseDouble(JOptionPane.showInputDialog(null, "How much did the " + materialName + " cost?")); // 1-3b
        finalCost = materialCost * (1 + taxRate); //1-3def
        totalPurchases = totalPurchases + finalCost; //1-3def
    }

    //Class 1 - 4 .. print the final line in the black box
    public static void MoneyRemainingInBudget()
    {
        System.out.println("\n\nAfter purchasing the above items totaling " + totalPurchases + ", the budget remaining is " + (initialBudget - totalPurchases));
    }

    //Class 1 - 5  .. two final methods
    public void displayPurchase() //no parameters for first method!
    {
        System.out.println(materialName
                                       + "\t\t$" + materialCost
                                       + "\t\t$"+ finalCost
                                       + "\t\t$"
                                       + (initialBudget - totalPurchases));
    }
    public void displayPurchase(final Spring flag) //string variable parameter
    {
        System.out.println("Revised Cost \n" + materialName + "\t\t$" + materialCost + "\t\t$" + finalCost + "\t\t$" +(initialBudget - totalPurchases));
    }

}