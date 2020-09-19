import javax.swing.JOptionPane;
public class FloorAndDecor
{
    private static final double TAX = .085;
    private static double initialBudget;
    private static double totalPurchases;
    private String materialName;
    private double materialCost;
    private double finalCost;

    public FloorAndDecor(double budget)
    {
        FloorAndDecor.initialBudget = budget;
    }

    public FloorAndDecor()
    {
        materialName = JOptionPane.showInputDialog(null,"What material did you purchase ");
        materialCost = Double.parseDouble(JOptionPane.showInputDialog(null,"How much did the " + materialName + " cost?"));
        finalCost = materialCost * (1 + TAX);
        totalPurchases = totalPurchases + finalCost;
    }

    public void reviseMaterialCost()
    {
        totalPurchases = totalPurchases - finalCost;
        materialCost = Double.parseDouble(JOptionPane.showInputDialog(null, "How much did the "+ materialName +" cost?"));
        finalCost = materialCost * (1 + TAX);
        totalPurchases = totalPurchases + finalCost;
    }

    public static void MoneyRemainingInBudget()
    {
        System.out.print("\n\nAfter purchasing the above items totaling " + totalPurchases + ", the budget remaining is $" + (initialBudget - totalPurchases));
    }

    public void displayPurchase()
    {
        System.out.println(materialName + "\t\t$" + materialCost + "\t\t$"+ finalCost + "\t\t$" + (initialBudget - totalPurchases));
    }

    public void displayPurchase(String flag)
    {
        System.out.println("Revised Cost \n" + materialName + "\t\t$" + materialCost + "\t\t$" + finalCost + "\t\t$" + (initialBudget - totalPurchases));
    }
}