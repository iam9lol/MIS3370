import javax.swing.JOptionPane;
public class MIS33702020SpringQuiz1B
{
    public static void main(String args[]) {
        double enteredBudget;
        enteredBudget = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Budget Amount for Kitchen Remodel"));
        System.out.println("The budget for Kitchen Remodel " + "is $" + enteredBudget);
        System.out.println("Material \t\tCost\t\tTotal Cost \tRemaining Budget");

        FloorAndDecor budget = new FloorAndDecor(enteredBudget);

        FloorAndDecor purchase1 = new FloorAndDecor();
        displayPurchases(purchase1);

        FloorAndDecor purchase2 = new FloorAndDecor();
        displayPurchases(purchase2); 

        JOptionPane.showMessageDialog(null,
            "please enter revised price for this item");
        purchase2.reviseMaterialCost();
        purchase2.displayPurchase("R");

        FloorAndDecor.MoneyRemainingInBudget();
    }

    public static void displayPurchases(FloorAndDecor item)
    {
        item.displayPurchase();
    }
}